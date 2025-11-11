// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operation
		System.out.println(Math.sqrt(76123));
		System.out.println(mod(13,3));
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));

	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		for (int i = 0 ; i < x2 ; i++){
			x1++;
		}

		
		return x1;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		for (int i = 0 ; i < x2 ; i++){
			x1--;
		}
		return x1;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		int times = x1;
		for (int i = 1 ; i < x2 ; i++){
			times = plus(times , x1);
		}		
		return times;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int powerOf = x;
		for (int i = 1 ; i < n ; i++){
			powerOf = times(powerOf, x);


		}
		return powerOf;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		int divideBy = 0;
		// -- 12/4 = 3
		while (times(divideBy, x2) < x1){
			divideBy ++;
			if (times(divideBy, x2) > x1) {
				divideBy--;
				break;
			}
		}
		return divideBy;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		int modulo = 0;
		int divideBy = 0;

		// 13/3 4 1/3
		while (times(divideBy, x2) < x1){
			divideBy ++;
			if (times(divideBy, x2) > x1) {
				divideBy--;
				modulo = x1 - times(divideBy, x2);
				
				break;
			}
		}		
		return modulo;
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		int g = 1;
		double epsilon = -0.01;

		while ((minus(times(g, g), x)) <= epsilon ){
			g++;
			if (true) {
				
			}
		}
		return g;
	}	  	  
}