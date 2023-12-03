package accenture;

public class EvenOddArray {

	public static int print(int[] arr)
	{
		int[] even=new int[(arr.length/2)+1];
		int[] odd=new int[(arr.length/2)];
		int k=0;
		int l=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				even[k]=arr[i];
				k++;
			}
			else {
				odd[l]=arr[i];
				l++;
			}
		}
		for(int e:even)
		{
			System.out.print(e+" ");
		}
		System.out.println();
		for(int e:odd)
		{
			System.out.print(e+" ");
		}
		System.out.println();
		int max1=even[0];
		for(int i=0;i<even.length;i++)
		{
			if(max1<even[i])
			{
				max1=even[i];
			}
		}
		int max2=odd[0];
		for(int i=0;i<odd.length;i++)
		{
			if(max2<odd[i])
			{
				max2=odd[i];
			}
		}
		return max1+max2;
		
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,4,7,0,5,9};
		System.out.println("sum = "+print(arr));
	}
}
