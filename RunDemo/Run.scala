object Run
   {
/*
Note −

Implicit classes must be defined inside another class/object/trait (not in top level).

Implicit classes may only take one non –implicit argument in their constructor.

Implicit classes may not be any method, member or object in scope with the same name as the implicit class.
*/
   implicit class IntTimes(x: Int)
      {
      def times [A](f: =>A): Unit =
	 {
         def loop(current: Int): Unit =
         
         if(current > 0)
	    {
            f
            loop(current - 1)
            }
         loop(x)
      	 }
      }
   }
