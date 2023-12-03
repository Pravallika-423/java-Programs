package accenture;

public class Divby3And5 {

	public static int print(int n1,int n2)
	{
		int sum=0;
		for(int i=n1+1;i<n2;i++)
		{
			if(i%3==0 && i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(print(12,50));
	}
}
