package accenture;

public class ReplacceCharacter {

	public static String print(String str,char ch1,char ch2)
	{
		String res="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch1)
			{
				res=res+ch2;
			}
			if(str.charAt(i)==ch2)
			{
				res=res+ch1;
			}
			if(str.charAt(i)!=ch1 && str.charAt(i)!=ch2)
			{
			res=res+str.charAt(i);}
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(print("appppaale",'a','p'));
	}
}
