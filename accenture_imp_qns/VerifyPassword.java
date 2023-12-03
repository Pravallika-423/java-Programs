 package accenture;

public class VerifyPassword {

	public static int verify(String str)
	{
		int c1=0,c2=0;
		if(str.length()<4)
		{
			return 0;
		}
		if(str.charAt(0)>='0' && str.charAt(0)<='9')
		{
			return 0;
		}
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ' || str.charAt(i)=='/')
			{
				return 0;
			}
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				c1++;
			}
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				c2++;
			}
		}
		if(c1>0 && c2>0)
		{
		return 1;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		System.out.println(verify("abc44As@"));
	}
}
