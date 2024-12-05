import scala.io.StdIn

object practicalone {


  def a1q1(no:Int):Unit=
    {
      if(no>0)
        {
          println("positive")
        }
      else if(no<0)
        {
          println("negative")
        }
      else
        {
          println("zero")
        }
    }
def a1q2()
  { {
    println("Enter a number")
    val a=StdIn.readInt()
    val b=StdIn.readInt()
    val c=StdIn.readInt()
    val d=StdIn.readInt()
    var max1=a
    var max2=b
    if(b>max1)
    {
      max1=b
      max2=a
    }
    if(c>max1)
    {
      max2=max1
      max1=c
    }
    else if(c>max2)
    {
      max2=c
    }
    if(d>max1)
    {
      max2=max1
      max1=d
    }
    else if(d>max2)
    {
      max2=d
    }
    println(s"Secound maximum number is : $max2")
  }
  }
  def a1q3(fact:Float):Unit=
    {
      var f=1;
      var i=1;
      while(i <=fact)
        {
          f=f*i;
          i=i+1;
        }
        println("factorial is"+f)
    }

  def a1q4(n1:Int,n2:Int):Unit=
    {
      var sum=0;
      var c=0;
      for(i<-n1 to n2)
        {
          sum=sum+i;
          c=c+1;
        }
        println("average"+(sum/c))
    }
  def main(args:Array[String]):Unit=
    {
     // a1q1(0);
      //a1q3(5);
      //a1q4(100,300);
    a1q2()
    }
}
