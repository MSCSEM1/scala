object practicalthree {

  def main(args:Array[String]):Unit=
    {

      //a3q1()
      //a3q2()
      //a3q3()
      a3q4()
    }
    def a3q1(): Unit =
    {
      var str=scala.io.StdIn.readLine("enter string")
      var c=0;
      var l=str.length-1
      for(i<-0 to l)
      {
        if(str.charAt(i).isUpper)
        {
          c=c+1
        }
      }
      println("no of up char "+c)
      println("str in lower = "+str.toLowerCase)
    }

  def a3q2(): Unit = {
    val str=scala.io.StdIn.readLine("enter String")
    val ch=scala.io.StdIn.readLine("enter char")
    var c=0;
    val l=str.length-1
    for(i<-0 to l)
      {
        if(str.charAt(i)==ch.charAt(0))
          {
            c=c+1
          }
      }
      println("no of occurences  "+ c)
  }

  def a3q3(): Unit = {
    var pos=scala.io.StdIn.readInt()
    val str=scala.io.StdIn.readLine("str =")
    println(str.substring(0,pos)+str.substring(pos+1,str.length))

  }
  def a3q4(): Unit = {
    var str=scala.io.StdIn.readLine("STRING =")
    if(str==str.reverse)
      {
        println("str is palindrmic")
      }
    else
      {
        println("not palindromic")
      }
  }
}
