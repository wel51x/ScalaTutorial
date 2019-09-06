// Traits
trait Equal
   {
   def isEqual(x: Any): Boolean
   def isNotEqual(x: Any): Boolean = !isEqual(x)
   }

class Point(xc: Int, yc: Int) extends Equal
   {
   var x: Int = xc
   var y: Int = yc
   
   def isEqual(obj: Any) = obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == y

   def locate(): Unit = 
      {
      println ("Point x, y location : " + x + ", " + y);
      }

   }

object Traits {
   def main(args: Array[String]): Unit = 
      {
      println( "\nTraits");
      val p1 = new Point(2, 3)
      val p2 = new Point(2, 4)
      val p3 = new Point(3, 3)
      println( "p1:");
      p1. locate();
      println( "p2:");
      p2. locate();
      println( "p3:");
      p3. locate();

      println("p1 != p2: ", p1.isNotEqual(p2))
      println("p1 != p3: ", p1.isNotEqual(p3))
      println("p1 != 2: ", p1.isNotEqual(2))
      println()
      }
   }
