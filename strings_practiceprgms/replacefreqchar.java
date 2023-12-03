package practiceprgms;

public class replacefreqchar {

	
	    public static String ChatFrequentcharacter(String str, char x) {
	        if (str == null || str.isEmpty()) {
	            return str;
	        }

	        int[] charFrequency = new int[256]; // Assuming ASCII characters

	        // Count the frequency of each character in the string
	        for (char c : str.toCharArray()) {
	            charFrequency[c]++;
	        }

	        char mostFrequentChar = '\0';
	        int maxFrequency = 0;

	        // Find the most frequent character with the lowest ASCII value
	        for (int i = 0; i < 256; i++) {
	            if (charFrequency[i] > maxFrequency || (charFrequency[i] == maxFrequency && i < mostFrequentChar)) {
	                mostFrequentChar = (char) i;
	                maxFrequency = charFrequency[i];
	            }
	        }

	        // Replace the most frequent character with 'x'
	        StringBuilder result = new StringBuilder();
	        for (char c : str.toCharArray()) {
	            if (c == mostFrequentChar) {
	                result.append(x);
	            } else {
	                result.append(c);
	            }
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	        String str = "bbadbbababb";
	        char x = 't';
	        String result = ChatFrequentcharacter(str, x);
	        System.out.println(result);  // Output: "ttadttatatt"
	    }
	}


