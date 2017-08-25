def sum(f:Int => Int,a:Int , b:Int)={
  def loop(a:Int , acc:Int):Int={
    if(a>b)acc
    else
      loop(a+1,f(a)+acc)
  }
  loop(a,0)
}
sum(x=>x*x,5,10)

def mapReduce(f:Int => Int , combine:(Int,Int)=>Int,zero:Int)(a:Int,b:Int):Int=if(a>b)zero else combine(f(a),mapReduce(f,combine,zero)(a+1,b))

def product(f:Int=>Int)(a:Int,b:Int)=mapReduce(f,(x,y)=>x*y,1)(a,b)
product(x=>x)(1,5)

def factorial(n:Int)=product(x=>x)(1,n)
factorial(5)

def summation(f:Int=>Int)(a:Int,b:Int)=mapReduce(f,(x,y)=>x+y,0)(a,b)
summation(x=>x)(10,20)