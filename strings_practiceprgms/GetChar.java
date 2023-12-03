package practiceprgms;

public class GetChar {
	public static char print(String str,int index)
	{
		for(int i=0;i<str.length();i++)
		{
			if(i==index)
			{
				return str.charAt(i);
			}
		}
		return '0';
	}
	public static void main(String[] args) {
		System.out.println(print("String",5));
	}
}
