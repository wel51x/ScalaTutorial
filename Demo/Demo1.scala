import java.io._

class Point(val xc: Int, val yc: Int)
   {
   var x: Int = xc
   var y: Int = yc
   
   def move(dx: Int, dy: Int): Unit = 
      {
      x = x + dx
      y = y + dy
      println ("Point x location : " + x);
      println ("Point y location : " + y);
      }

   def locate(): Unit = 
      {
      println ("Point x location : " + x);
      println ("Point y location : " + y);
      }

   }

object Demo1
   {
   def main(args: Array[String]): Unit = 
      {
      val pt = new Point(10, 20);
      pt. locate();

      // Move to a new location
      println ("Moving...");
      pt.move(10, 10);
      }
   }
