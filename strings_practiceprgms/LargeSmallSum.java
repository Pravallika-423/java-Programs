package practiceprgms;

import java.util.Arrays;

public class LargeSmallSum {
    public static int sumSecondSmallestOddAndSecondLargestEven(int[] arr) {
        // Check if the array is empty or its length is less than 3
        if (arr == null || arr.length < 3) 
        {
            return 0;
        }

        int[] oddPositions = new int[arr.length / 2];
        int[] evenPositions = new int[(arr.length + 1) / 2];

        // Populate odd and even position arrays
        for (int i = 0; i < arr.length; i++) 
        {
            if (i % 2 == 0) {
                evenPositions[i /2] = arr[i];
            } 
            else {
                oddPositions[i / 2] = arr[i];
            }
        }

        // Sort both arrays
        Arrays.sort(oddPositions);
        Arrays.sort(evenPositions);

        // Check if there are at least 2 elements in each array
        if (oddPositions.length < 2 || evenPositions.length < 2) 
        {
            return 0;
        }

        int secondSmallestOdd = oddPositions[1];
        int secondLargestEven = evenPositions[evenPositions.length - 2];

        return secondSmallestOdd + secondLargestEven;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 7, 5, 4};
        int result = sumSecondSmallestOddAndSecondLargestEven(arr);
        System.out.println(result);  // Output: 7
    }
}

		
		
	
