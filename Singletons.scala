// Singletons
import java.io._

class Point(val xc: Int, val yc: Int)
   {
   var x: Int = xc
   var y: Int = yc
   
   def move(dx: Int, dy: Int): Unit = 
      {
      x = x + dx
      y = y + dy
      }
   }

object Singletons
// singleton object
   {
   def main(args: Array[String]): Unit = 
      {
      val point = new Point(10, 20);
      println( "\nSingletons");
      printPoint

      // Move to a new location
      println ("Moving...");
      point.move(10, 10);
      printPoint
      println();

      def printPoint: Unit =
	 {
         println ("Point x location : " + point.x);
         println ("Point y location : " + point.y);
      	 }
      }
   }
