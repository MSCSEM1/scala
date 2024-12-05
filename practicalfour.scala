object practicalfour {

  def main(args:Array[String]): Unit = {
   // a4q1()
   //a4q2()
    //a4q3()
    a4q4()
  }
//////////////////////////////////////////////////////  q1  //////////////////////////////////////////////
  def a4q1(): Unit = {
    val s1=scala.io.StdIn.readLine()
    val s2=scala.io.StdIn.readLine()
    var s3=s1+s2
    if(s1.length==s2.length)
    {
      if (s3.contains(s1)) {
        println("is in rotation")
      }
      else
        {
          println("not in rotation")
        }
    }
    else
    {
      println("not in rotation")
    }
  }
  //////////////////////////////////////////////////////  q2  //////////////////////////////////////////////\

  def a4q2(): Unit = {
    var Arra=Array("kamlesh","suraj","hemant")
    val str =scala.io.StdIn.readLine()
    for(s<-Arra)
      {
        if(s.contains(str))
          {
            println(s)
          }
      }
  }

  //////////////////////////////////////////////////////  q3  //////////////////////////////////////////////

  def a4q3(): Unit = {
      var s="hello buddy "
    println(s.split(" ").map(_.reverse).mkString(" "))
  }

  ///////////////////////////////////////////////////  q4 //////////////////////////////////////////////////

  def a4q4(): Unit = {
    val s1=scala.io.StdIn.readLine()
    val s2=scala.io.StdIn.readLine()
    if(s1.length==s2.length)
      {
        println(s1+s2)
      }
    else
      {
        if(s1.length>s2.length)
          {
            var diff=s1.length-s2.length
            println(s1.substring(diff,s1.length))
          }
        else
          {
            var diff=s2.length-s1.length
            println(s2.substring(diff,s2.length))
          }
      }
  }

}
