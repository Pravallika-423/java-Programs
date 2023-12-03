package programs;

public class MergeArrays {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 0, 0, 0 };
		int[] arr2 = { 2, 5, 6 };

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr1.length - 1;j++) {
				if (arr2[i] <= arr1[j]) {
					int temp = arr1[j];
					arr1[j] = arr2[i];
					int temp2=arr1[j+1];
					temp2 = arr1[j];
				}
			}
		}
		for (int a : arr1) {
			System.out.println(a);
		}
	}
}
