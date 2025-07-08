
public class Soru3 {
	 public static String toBinary(int decimalNumber) {
	        if (decimalNumber < 0) {
	            
	            return "1" + toBinary(-decimalNumber);
	        } else if (decimalNumber == 0) {
	            
	            return "0";
	        } else {
	            
	            StringBuilder binaryResult = new StringBuilder();
	            while (decimalNumber > 0) {
	                int remainder = decimalNumber % 2;
	                binaryResult.insert(0, remainder);
	                decimalNumber /= 2;
	            }
	            return binaryResult.toString();
	        }
	    }
}
