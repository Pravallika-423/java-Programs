package accenture;

public class divbyM {

	public static int print(int n,int m)
	{
		int sum1=0;
		int sum2=0;
		for(int i=1;i<=n;i++)
		{
			if(i%m==0)
			{
				sum1=sum1+i;
			}
			if(i%m!=0)
			{
				sum2=sum2+i;
			}
		}
		return sum2-sum1;
	}
	public static void main(String[] args) {
		System.out.println(print(10,3));
	}
}
