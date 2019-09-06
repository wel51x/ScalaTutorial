// Matching using Case Classes
object CaseClasses
   {
   def main(args: Array[String]): Unit = 
      {
      val alice = new Person("Alice", 25)
      val bob = new Person("Bob", 32)
      val charlie = new Person("Charlie", 32)
   
      println( "\nCaseClasses");
      for (person <- List(alice, bob, charlie))
	 {
	 print(person + " ")
         person match
	    {
            case Person("Alice", 25) => println("Hi Alice!")
            case Person("Bob", 32) => println("Hi Bob!")
            case Person(name, age) => println(
               "Age: " + age + " year, name: " + name + "?")
            }
      	 }
      println()
      }
   case class Person(name: String, age: Int)
   }
