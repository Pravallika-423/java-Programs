package accenture;

public class DectoBase {

	public static String dectobase(int n,int num)
	{
		int rem=0;
		int quo=0;
		String res="";
		String r=""; 
		while(num>0)
		{
			rem=num%n;
			
			r=convert(rem);
			res=rem+res;
			
			quo=num/n;
			num=num/n;
		}
		return res;
	}
	public static String convert(int r)
	{
		if(r==10)
		{
			return "A";
		}
		else if(r==11)
		{
			return "B";
		}
		else if(r==12)
		{
			return "C";
		}
		else if(r==13)
		{
			return "D";
		}
		else if(r==14)
		{
			return "E";
		}
		else if(r==15)
		{
			return "F";
		}
		else {
			return r+"";
		}
	}
	public static void main(String[] args) {
		System.out.println(dectobase(20,56789));
	}
}
