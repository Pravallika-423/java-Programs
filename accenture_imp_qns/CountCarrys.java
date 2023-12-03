package accenture;

public class CountCarrys {

	public static int count(int n1,int n2)
	{
		int c=0;
		int max=Math.max(n1,n2);
		while(max>0)
		{
			int r1=n1%10;
			int r2=n2%10;
			
			n1=n1/10;
			n2=n2/10;
			
			int s=r1+r2;
			
			if(s>9)
			{
				c++;
				n2=print(n2);
			}
			max=max/10;
		}
		return c;
	}
	public static int print(int num)
	{
		while(num>0)
		{
			int p=num%10;
			num=num/10;
			num=num*10+(p+1);
			break;
			
		}
		return num;
	}
	public static void main(String[] args) {
		System.out.println(count(563,447));    
	}
}
