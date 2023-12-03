package practiceprgms;

public class ReverseString {

	public static String print(String str)
	{
		String res="";
		for(int i=0;i<str.length();i++)
		{
			res=str.charAt(i)+res;
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(print("abcd"));
	}
}

