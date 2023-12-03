package practiceprgms;

public class HardEasyWord {

	
	    public static int difficulty(String str, int len) {
	        int vowels = 0;     // Count of vowels in the string
	        int consonants = 0; // Count of consonants in the string
	        int hard = 0;       // Count of hard words
	        int easy = 0;       // Count of easy words
	        int consecutiveConsonants = 0; // Count of consecutive consonants

	        for (int i = 0; i < len; i++) {
	            char ch = str.charAt(i);
	            // Check if the current character is a vowel
	            if (isVowel(ch)) {
	                vowels++;
	                consecutiveConsonants = 0; // Reset consecutive consonants count
	            } else if (ch != ' ') {
	                consonants++;
	                consecutiveConsonants++;
	                if (consecutiveConsonants >= 3) {
	                    // If there are 3 consecutive consonants, mark the word as hard
	                    hard++;
	                    consecutiveConsonants = 0; // Reset consecutive consonants count
	                }
	            }

	            // Check for word boundaries (space)
	            if (ch == ' ' || i == len - 1) {
	                // Check conditions to classify the word as hard or easy
	                if (consonants > vowels || consecutiveConsonants >= 3) {
	                    hard++;
	                } else {
	                    easy++;
	                }
	                

	                // Reset counters for the next word
	                consonants = 0;
	                vowels = 0;
	                consecutiveConsonants = 0;
	            }
	            
	        }
	        System.out.println(hard);
            System.out.println(easy);

	        // Calculate the difficulty quotient
	        int difficultyQuotient = (5 * hard) - (2 * easy);

	        return difficultyQuotient;
	    }

	    public static boolean isVowel(char ch) {
	        // Function to check if a character is a vowel
	        String vowels = "aeiou";
	        return vowels.contains(String.valueOf(ch));
	    }

	    public static void main(String[] args) {
	        String input = "qiewldoaa life ace by fantasy" ;
	        int len = input.length();

	        int result = difficulty(input, len);
	        System.out.println("Difficulty Quotient: " + result);
	    }
	}


