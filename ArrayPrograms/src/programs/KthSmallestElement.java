package programs;

public class KthSmallestElement {

	public static int print(int[] arr,int k)
	{
		int min=0;
		min=arr[0];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min && arr[i]!=-1)
			{
				min=arr[i];
				arr[i]=-1;
				j++;
			}
			if(j==k)
			{
				System.err.println(min);
				break;
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int[] arr= {88,0,12,45,33,1,8,9};
		
		System.out.println(print(arr,3));
	}
}
