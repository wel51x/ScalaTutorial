// Pattern Matching
object PatternMatching
   {
   def main(args: Array[String]): Unit = 
      {
      println( "\nPatternMatching");
      println("two matches " + matchTest("two"))
      println("test matches " + matchTest("test"))
      println("1 matches " + matchTest(1))
      println()
      }

   def matchTest(x: Any): Any = x match
      {
      case 1 => "one"
      case "two" => 2
      case y: Int => "scala.Int"
      case _ => "many"
      }
   }
