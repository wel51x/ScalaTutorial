// Exception Handling
import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException
/*
Throwing Exceptions
throw new IllegalArgumentException
*/
object ExceptionHandling
   {
   def main(args: Array[String]): Unit = 
      {
      println( "\nExceptionHandling");
      try
	 {
         val f = new FileReader("input.txt")
      	 }
      catch
	 {
         case ex: FileNotFoundException =>
	    {
            println("Missing file exception")
            }
         
         case ex: IOException =>
	    {
            println("IO Exception")
            }
         }

      finally
	 {
	 println("Exiting finally...")
      	 }
      println()
      }
   }
