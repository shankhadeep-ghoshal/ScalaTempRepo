/**
  * Created by dogpatch06 on 7/9/17.
  */
object PascalTriangle {
  def main(args: Array[String]): Unit = {
    val k=scala.io.StdIn.readInt()
    for(row <-0 to k){
      for(col<-0 to row){
        print(PascalTriancle(col,row)+" ")
      }
      println()
    }
  }

  def PascalTriancle(column:Int , row:Int):Int ={
      if (column==0 || row ==0 || column==row)1
      else
        PascalTriancle(column-1,row-1)+PascalTriancle(column,row-1)
  }
}
