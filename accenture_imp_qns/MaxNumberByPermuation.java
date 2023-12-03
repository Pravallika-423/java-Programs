package accenture;

public class MaxNumberByPermuation {

	public static long print(int[] arr)
	{
		long num=0;
		int max=arr[0];
		for(int j=0;j<arr.length;j++)
		{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				arr[i]=-1;
			}
			num=num*10+max;
		}
//		num=num*10+max;
//		System.out.println(num);
		}
		return num;
	}
	
	public static void main(String[] args) {
		int[] arr= {3,4,7,9,5,8,6,4};

		System.out.println(print(arr));
	}
}
