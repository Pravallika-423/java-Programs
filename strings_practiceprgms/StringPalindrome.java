package practiceprgms;

public class StringPalindrome {
	public static String print(String str)
	{
		String res="";
		for(int i=str.length()-1;i>=0;i--)
		{
			res=res+str.charAt(i);
		}
		if(str.equals(res))
		{
			return "palindrome";
		}
		return "not a palindrome";
	}
	public static void main(String[] args) {
		System.out.println(print("madamm"));
	}

}
