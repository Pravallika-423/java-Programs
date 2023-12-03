package programs;

public class ReplaceValue {
	public static void main(String[] args) {
		int[] a= {45,12,88,90,7,32,3,89,9,100};
		int min=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(min<a[i])
			{
				a[i]=min;
			}
			else {
				min=a[i];
				a[i]=-1;
			}
		}
	
	for(int e:a)
	{
		System.out.print(e+",");
	}

}
}