// Extractors
object Extractors
   {
   def main(args: Array[String]): Unit = 
      {
      println( "\nExtractors");
      println ("Apply method : " + apply("Zara", "gmail.com"));
      println ("Unapply method : " + unapply("Zara@gmail.com"));
      println ("Unapply method : " + unapply("Zara Ali"));
      println()
      }
   
   // The injection method (optional)
   def apply(user: String, domain: String) =
      {
      user +"@"+ domain
      }

   // The extraction method (mandatory)
   def unapply(str: String): Option[(String, String)] =
      {
      val parts = str split "@"
      
      if (parts.length == 2)
	 {
         Some(parts(0), parts(1)) 
      	 }
      else
	 {
         None
      	 }
      }
   }
