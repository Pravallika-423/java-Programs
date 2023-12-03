package programs;

public class SecondLargestNumber {

	public static int secLargest(int[] arr)
	{
		int max=0;
		int secmax=0;
		max=arr[0];
		secmax=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>secmax && arr[i]<max)
			{
				secmax=arr[i];
				
			}
		}
		return secmax;
	}
	public static void main(String[] args) {
		int arr[]= {8,1,4,9,2,6,10,15,80,98};
		System.out.println(secLargest(arr));
	}
}
