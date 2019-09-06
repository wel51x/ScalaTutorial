import scala.collection.mutable.HashMap
import scala.collection.immutable.{TreeMap, TreeSet}

object HelloWorld
   /* This is my first scala program.  
    * This will print 'Hello World' as the output
    * This is an example of multi-line comments.
    */
    {
    def main(args: Array[String]): Unit = 
	{
	// Prints Hello World
	// This is also an example of single line comment.
	val myVal : String = 
"""this string
spans three
lines."""
	println("Hello, Winston, from scala!")
	println(myVal)
	}
    }
