// Processing Arrays
import Array._
object Arrays
   {
   def main(args: Array[String]): Unit = 
     {
      var myList = Array(1.9, 2.9, 3.4, 3.5)
      
      // Print all the array elements
      println( "\nArrays");
      println( "Array elements are:");
      for ( x <- myList )
	 {
         println( x )
      	 }

      // Summing all elements
      var total = 0.0;
      
      for ( i <- 0 to (myList.length - 1))
	 {
         total += myList(i);
      	 }
      println("Total is " + total);

      // Finding the largest element
      var max = myList(0);
      
      for ( i <- 1 to (myList.length - 1) )
	 {
         if (myList(i) > max) max = myList(i);
      	 }
      
      println("Max is " + max);
      println("Average is " + total / myList.length);

      var myMatrix = ofDim[Int](3,3)
      
      // build a matrix
      for (i <- 0 to 2)
	 {
         for ( j <- 0 to 2)
	    {
            myMatrix(i)(j) = j+i;
            }
      	 }
      
      // Print two dimensional array
      println( "\n2D Array elements are:");
      for (i <- 0 to 2)
	 {
         for ( j <- 0 to 2)
	    {
            print(" " + myMatrix(i)(j));
            }
         println();
      	 }

// Concatenate Arrays
      val myList1 = Array(1.9, 2.9, 3.4, 3.5)
      val myList2 = Array(8.9, 7.9, 0.4, 1.5)

      var myList3 =  concat( myList1, myList2)
      
      // Print all the array elements
      print( "\nConcatenated Array elements are: ");
      for ( x <- myList3 )
         print( x, ' ' )
      println();

// Create Array with Range
      var myList1a = range(10, 20, 2)
      var myList2a = range(10,20)

      // Print all the array elements
      println( "\nRange Array elements are:");
      print( "myList1a: ");
      for ( x <- myList1a )
         print( " " + x )
      
      print( "\nmyList2a: ");
      for ( x <- myList2a )
         print( " " + x )
      println('\n');
/*
Scala Array Methods
No	Methods with Description
1	def apply( x: T, xs: T* ): Array[T]
	xCreates an array of T objects, where T can be Unit, Double, Float, Long, Int, Char, Short, Byte, Boolean.

2	def concat[T]( xss: Array[T]* ): Array[T]
	Concatenates all arrays into a single array.

3	def copy( src: AnyRef, srcPos: Int, dest: AnyRef, destPos: Int, length: Int ): Unit
	Copy one array to another. Equivalent to Java's System.arraycopy(src, srcPos, dest, destPos, length).

4	def empty[T]: Array[T]
	Returns an array of length 0

5	def iterate[T]( start: T, len: Int )( f: (T) => T ): Array[T]
	Returns an array containing repeated applications of a function to a start value.

6	def fill[T]( n: Int )(elem: => T): Array[T]
	Returns an array that contains the results of some element computation a number of times.

7	def fill[T]( n1: Int, n2: Int )( elem: => T ): Array[Array[T]]
	Returns a two-dimensional array that contains the results of some element computation a number of times.

8	def iterate[T]( start: T, len: Int)( f: (T) => T ): Array[T]
	Returns an array containing repeated applications of a function to a start value.

9	def ofDim[T]( n1: Int ): Array[T]
	Creates array with given dimensions.

10	def ofDim[T]( n1: Int, n2: Int ): Array[Array[T]]
	Creates a 2-dimensional array

11	def ofDim[T]( n1: Int, n2: Int, n3: Int ): Array[Array[Array[T]]]
	Creates a 3-dimensional array

12	def range( start: Int, end: Int, step: Int ): Array[Int]
	Returns an array containing equally spaced values in some integer interval.

13	def range( start: Int, end: Int ): Array[Int]
	Returns an array containing a sequence of increasing integers in a range.

14	def tabulate[T]( n: Int )(f: (Int)=> T): Array[T]
	Returns an array containing values of a given function over a range of integer values starting from 0.

15	def tabulate[T]( n1: Int, n2: Int )( f: (Int, Int ) => T): Array[Array[T]]
	Returns a two-dimensional array containing values of a given function over ranges of integer values starting from 0.
*/
      }
   }
