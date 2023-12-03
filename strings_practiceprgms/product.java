package practiceprgms;

import java.util.Arrays;

public class product {

	public static int print(int[] arr,int sum) {
		Arrays.sort(arr);
		if(arr.length<2)
		{
			return -1;
		}
		
		int add=0;
		int pro=0;
			add=arr[0]+arr[1];
			if(add<=sum)
			{
				pro=arr[0]*arr[1];
			}
			return pro;
		
	}
	public static void main(String[] args) {
		int[] arr= {9,8,-7,3,9,3};
		int sum=9;
		System.out.println(print(arr,sum));
}
}