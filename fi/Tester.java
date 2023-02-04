/*
Question 1:

FI -> abstract-> cube()
      default -> square(), add()
      static -> sub() mul() div()
      implement interface-> override abstract-> obj
*/

package week3_Assignment3.fi;

public class Tester {

	public static void main(String[] args) {
		Calc c = (int val)-> val*val*val;
	    System.out.println("CUBE OF 3 IS: " + c.cube(3));
	    System.out.println("SQUARE OF 3 IS: " + c.square(3));
	    System.out.println("SUM OF 6 AND 7 IS: "+c.add(6, 7));
	    System.out.println("DIFFERENCE BETWEEN 7 AND 6 IS: "+Calc.sub(7, 6));
	    System.out.println("MULTIPLICATION OF 6 AND 7 IS: "+Calc.mul(6, 7));
	    System.out.println("DIVISION OF 6 AND 3 IS: "+Calc.div(6, 3));
	}

}

/*
EXPECTED INPUT/OUTPUT
CUBE OF 3 IS: 27
SQUARE OF 3 IS: 9
SUM OF 6 AND 7 IS: 13
DIFFERENCE BETWEEN 7 AND 6 IS: 1
MULTIPLICATION OF 6 AND 7 IS: 42
DIVISION OF 6 AND 3 IS: 2
*/
