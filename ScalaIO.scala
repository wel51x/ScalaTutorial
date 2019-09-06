// ScalaIO
import java.io._
import scala.io.Source

object ScalaIO
   {
   def main(args: Array[String]): Unit = 
      {
      println( "\nScalaIO");
      print("Please enter your input : " )
      val line = System.console().readLine
      
      println("Thanks, you just typed: " + line)

      val writer = new PrintWriter(new File("Demo.txt" ))
      writer.write(line)
      writer.close()

      println("Following is the content read from \"Demo.txt\":" )
      Source.fromFile("Demo.txt" ).foreach
	 {
         print 
	 }

      println()
      }
   }
