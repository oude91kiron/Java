/*-----------------------------------------------------------------------
The following program contains 7 mistakes! What are they?               -
                                                                        -
 1	public class Oops4 {                                                -
 2		public static void main(String[] args) {                        -
 3			int a = 7, b = 42;                                          -
 4			minimum(a, b);                                              -
 5			if {smaller = a} {                                          -
 6				System.out.println("a is the smallest!");               -
 7			}                                                           -
 8		}                                                               -
 9                                                                      -
10		public static void minimum(int a, int b) {                      -
11			if (a < b) {                                                -
12				int smaller = a;                                        -
13			} else (a => b) {                                           -
14				int smaller = b;                                        -
15			}                                                           -
16			return int smaller;                                         -
17		}                                                               -
18	}                                                                   -
-----------------------------------------------------------------------*/

1-	Line 5 ‘{‘
2-	Line 5 ‘}’
3-	Line 5 ‘=’
4-	Line 10 ‘void’
5-	Line 13 ‘else (condition)’ not statment
6-	Line 13 ‘=>’
7-	Line 16 ‘int’ smaller already has been defined
