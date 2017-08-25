/**
  * Created by dogpatch06 on 7/9/17.
  */
object Tail_recursion_Object {
  def main(args: Array[String]): Unit = {
    println(factorial(5))
    println(fibonacci(10))
  }
  def factorial(n : Int): Int = {
    def fact(n: Int, count: Int): Int = {
      val pros = if (n == 0) count else fact(n - 1, count * n);pros
    }
   val k=fact(n, 1);k
  }
  def fibonacci(n:Int):Int = {
    def fibb(n: Int, a: Int, b:Int):Int ={
      val temp = {
        if(n==0)a
        else if(n==1)b
        else fibb(n-1,b,a+b)
      };temp
    }
    val k=fibb(n,0,1);k
  }
}
