// Regular Expressions
import scala.util.matching.Regex

object RegularExpressions
   {
   def main(args: Array[String]): Unit = 
      {
      val pattern1 = "Scala".r
      val str = "Scala is Scalable and cool"
      val pattern2 = new Regex("(S|s)cala")
      val pattern3 = "(S|s)cala".r
      
      println( "\nPatternMatching");
      println(pattern1 findFirstIn str)

      println((pattern2 findAllIn str).mkString(","))

      println(pattern3 replaceFirstIn(str, "Java"))

      val pattern4 = new Regex("abl[ae]\\d+")
      val str1 = "ablaw is able1 and cool"
      
      println((pattern4 findAllIn str1).mkString(","))
      println()
/*
Forming Regular Expressions
Subexpression	Matches
^		Matches beginning of line.
$		Matches end of line.
.		Matches any single character except newline. Using m option allows it to match newline as well.
[...]		Matches any single character in brackets.
[^...]		Matches any single character not in brackets
\\A		Beginning of entire string
\\z		End of entire string
\\Z		End of entire string except allowable final line terminator.
re*		Matches 0 or more occurrences of preceding expression.
re+		Matches 1 or more of the previous thing
re?		Matches 0 or 1 occurrence of preceding expression.
re{ n}		Matches exactly n number of occurrences of preceding expression.
re{ n,}		Matches n or more occurrences of preceding expression.
re{ n, m}	Matches at least n and at most m occurrences of preceding expression.
a|b		Matches either a or b.
(re)		Groups regular expressions and remembers matched text.
(?: re)		Groups regular expressions without remembering matched text.
(?> re)		Matches independent pattern without backtracking.
\\w		Matches word characters.
\\W		Matches nonword characters.
\\s		Matches whitespace. Equivalent to [\t\n\r\f].
\\S		Matches nonwhitespace.
\\d		Matches digits. Equivalent to [0-9].
\\D		Matches nondigits.
\\A		Matches beginning of string.
\\Z		Matches end of string. If a newline exists, it matches just before newline.
\\z		Matches end of string.
\\G		Matches point where last match finished.
\\n		Back-reference to capture group number "n"
\\b		Matches word boundaries when outside brackets. Matches backspace (0x08) when inside brackets.
\\B		Matches nonword boundaries.
\\n, \\t, etc.	Matches newlines, carriage returns, tabs, etc.
\\Q		Escape (quote) all characters up to \\E
\\E		Ends quoting begun with \\Q

Regular-Expression Examples:
Example		Description
.		Match any character except newline
[Rr]uby		Match "Ruby" or "ruby"
rub[ye]		Match "ruby" or "rube"
[aeiou]		Match any one lowercase vowel
[0-9]		Match any digit; same as [0123456789]
[a-z]		Match any lowercase ASCII letter
[A-Z]		Match any uppercase ASCII letter
[a-zA-Z0-9]	Match any of the previous three
[^aeiou]	Match anything other than a lowercase vowel
[^0-9]		Match anything other than a digit
\\d		Match a digit: [0-9]
\\D		Match a nondigit: [^0-9]
\\s		Match a whitespace character: [ \t\r\n\f]
\\S		Match nonwhitespace: [^ \t\r\n\f]
\\w		Match a single word character: [A-Za-z0-9_]
\\W		Match a nonword character: [^A-Za-z0-9_]
ruby?		Match "rub" or "ruby": the y is optional
ruby*		Match "rub" plus 0 or more ys
ruby+		Match "rub" plus 1 or more ys
\\d{3}		Match exactly 3 digits
\\d{3,}		Match 3 or more digits
\\d{3,5}	Match 3, 4, or 5 digits
\\D\\d+		No group: + repeats \\d
(\\D\\d)+/	Grouped: + repeats \\D\d pair
([Rr]uby(, )?)+	Match "Ruby", "Ruby, ruby, ruby", etc.
*/
      }
   }
