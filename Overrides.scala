// Overrides
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

class Location(override val xc: Int, override val yc: Int, val zc :Int)
               extends Point(xc, yc)
   {
   var z: Int = zc

   def move(dx: Int, dy: Int, dz: Int): Unit = 
      {
      x = x + dx
      y = y + dy
      z = z + dz
      println ("Point x location : " + x);
      println ("Point y location : " + y);
      println ("Point z location : " + z);
      }

   override def locate(): Unit = 
      {
      println ("Point x location : " + x);
      println ("Point y location : " + y);
      println ("Point z location : " + z);
      }

   }

object Overrides
   {
   def main(args: Array[String]): Unit = 
      {
      val loc = new Location(10, 20, 15);
      println( "\nOverrides");
      loc.locate();

      // Move to a new location
      println ("Moving...");
      loc.move(10, 10, 5);
      println();
      }
   }
