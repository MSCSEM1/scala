object practicaltwo {
  def main(args:Array[String]):Unit=
    {
      //a2q1(6);
      //a2q2()
      a2q3()
      //a2q4()
    }
def a2q1(n:Int):Unit=
{
  var num=0
  var p=n*2;
  for(i<-1 to n)
    {
      if(n%i==0)
        {
          num=num+i
        }
    }
    if(num==p)
      {
        println("perfect no")
      }
}
  def a2q2():Unit=
    {
      var primesum=0
      for(i<-1 to 100)
        {
          var sum=0
          for(j<-2 to i)
            if(i%j==0)
              sum=sum+j
          if(sum==i)
          {
            primesum=primesum+i
            print(i+", ")
          }
        }
      println("\nsum of prime numbers are "+primesum)
    }
  def a2q3(): Unit = {
    var n=10
    println(n.toBinaryString)
    println(Integer.toOctalString(n))
}
  def a2q4(): Unit = {
    var term=scala.io.StdIn.readInt()
    var a=0;
    var b=1;
    var c=0;
    for(i<-1 to term)
      {
        println(a)
        c=a+b
        a=b
        b=c
      }
  }
}
