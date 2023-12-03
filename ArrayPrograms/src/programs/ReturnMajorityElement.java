package programs;

public class ReturnMajorityElement {
	public static int remove(int[] arr) {
		int max_count = 0;
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			int c = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					c++;

				}
			}
			if (c > max_count) {
				max_count = c;
				index = i;
			}

		}
		if (max_count > (arr.length / 2)) {
			return arr[index];
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 1, 2, 2, 1 };
		System.out.println(remove(arr));
	}
}
