package practiceprgms;

public class decto {

	
	    public static String DectoNBase(int n, int num) {
	        if (n <= 1 || n > 36 || num < 0) {
	            return "Invalid input";
	        }

	        String nBaseDigits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        StringBuilder result = new StringBuilder();

	        while (num > 0) {
	            int remainder = num % n;
	            char digit = nBaseDigits.charAt(remainder);
	            result.insert(0, digit);
	            num /= n;
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {

	    }
	}


