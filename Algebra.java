
import javax.print.attribute.standard.MediaSize;

// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operation

		System.out.println(div(100, 4));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		for (int i = 0 ; i < x2 ; i++){
			x1++;
		}
		for (int i = 0 ; i > x2 ; i--){
			x1--;
		}
		
		return x1;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		for (int i = 0 ; i < x2 ; i++){
			x1--;
		}
		for (int i = 0; i > x2 ; i--){
			x1++;
		}
		return x1;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		int times = x1;
		if (x1 == 0 || x2 == 0){
		 times = 0;
		}
		else if (x1 > 0 && x2 > 0){
			times = x1;
			for (int i = 1 ; i < x2 ; i++){
				times = plus(times , x1);
			
			}	
		}
		else if ((x1 < 0) && (x2 < 0)){
			x2 = minus(0, x2);
			x1 = minus(0, x1);
			times = x1;

			for (int i = 1 ; i < x2 ; i++){
				times = plus(times , x1);
			
			}


		} 

		else if (((x1 < 0 ) && (x2 > 0)) || (x1 > 0 ) && (x2 < 0)) {
			if (x1 < 0){
				x1 = minus(0, x1);
				times = x1;

				for (int i = 1 ; i < x2 ; i++){
					times = plus(times , x1);
				}
				
				times = minus(0, times);

				
			}
			else if (x1 > 0){
				x2 = minus(0, x2);
				for (int i = 1 ; i < x2 ; i++){
					times = plus(times , x1);
				}
				times = minus(0, times);

			}
		}
		return times;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int powerOf = x;
		if (n == 0) powerOf = 1; 

		else if (n > 0){
			for (int i = 1 ; i < n ; i++){
				powerOf = times(powerOf, x);
			}
		}
		else if (n < 0){
			for (int i = 1 ; i > n ; i++){

			}

		}
		return powerOf;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		int divideBy = 0;
		// -- 12/4 = 3
		if (x2 == 0 ) divideBy = 0;
		else if (x1 < 0 && x2 < 0){
			x1 = minus(0, x1);
			x2 = minus(0, x2);
			while (times(divideBy, x2) < x1){
				divideBy ++;
				if (times(divideBy, x2) > x1) {
					divideBy--;
					break;
				}
			}

		}
		else if ((x1 < 0 && x2 > 0)||(x1 > 0 && x2 < 0)){
			if (x1 < 0){
				x1 = minus(0, x1);
				
			}
			else if (x1 > 0){
				x2 = minus(0, x2);
			}
			while (times(divideBy, x2) < x1){
				divideBy ++;
				if (times(divideBy, x2) > x1) {
					divideBy--;
					break;
				}
			
			}
			divideBy = minus(0, divideBy);
		}
		else if (x1 > 0 && x2 >0){
			while (times(divideBy, x2) < x1){
				divideBy ++;
				if (times(divideBy, x2) > x1) {
					divideBy--;
					break;
				}
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

		if (x == 0){
			g = 0;
		}
		else {
			while ((minus(times(g, g), x)) <= epsilon ){
				g++;
				if ((minus(times(g, g), x)) > g){
					g--;
					break;
				}

			}
		}
		return g;
	}	  	  
}