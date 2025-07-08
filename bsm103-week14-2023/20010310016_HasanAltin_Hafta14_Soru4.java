
public class Soru4 {
	 public static int swapDigitPairs(int number) {
	        if (number < 10) {
	            .
	            return number;
	        } else {
	            int result = 0;
	            int digitPosition = 1;
	            while (number > 0) {
	               
	                int digit1 = number % 10;
	                number /= 10;

	                int digit2 = number % 10;
	                number /= 10;

	               
	                result += digitPosition * (digit2 * 10 + digit1);
	                digitPosition *= 100; 
	            }
	            return result;
	        }
	    }
}
