object Demo5
   {
   def main(args: Array[String]): Unit = 
      {
      println( "\nDemo5");
      val five:Int = 5
      val seven:Int = 7
      println(five + "+" + seven + "=" + addInt(five, seven) + '\n' );
      }
   
   def addInt( a:Int, b:Int ) : Int =
      {
      var sum:Int = 0
      sum = a + b

      return sum
      }
   }
