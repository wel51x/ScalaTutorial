// Pattern Matching with Extractors
object PatternMatchingwithExtractors
   {
   def main(args: Array[String]): Unit = 
      {
      println( "\nPatternMatchingwithExtractors");
      val x = PatternMatchingwithExtractors(5)
      println(x)

      x match
	 {
         case PatternMatchingwithExtractors(num) => println(x + " is twice greater than "+num)
         
         //unapply is invoked
         case _ => println("i cannot calculate")
      	}
      println()
      }
   def apply(x: Int) = x*2
   def unapply(z: Int): Option[Int] = if (z%2==0) Some(z/2) else None
   }
