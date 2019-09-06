// closure
object Closures
   {
   val factor = 3
   val multiplier = (i:Int) => i * factor
   def main(args: Array[String]): Unit = 
      {
      println( "\nClosures");
      println( "multiplier(1) value = " +  multiplier(1) )
      println( "multiplier(2) value = " +  multiplier(2) )
      println();
      }
   }
