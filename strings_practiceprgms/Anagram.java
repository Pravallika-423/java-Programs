package practiceprgms;

public class Anagram {
	
	public static boolean check(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}
		str1=lowercase(str1);
		str2=lowercase(str2);
		
		char[] ch1=tocharArray(str1);
		char[] ch2=tocharArray(str2);
		
		ch1=sort(ch1);
		ch2=sort(ch2);
		
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=ch2[i])
			{
				return false;
			}
		}
		return true;
		
	}
	public static String lowercase(String str)
	{
		String res="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				res=res+(char)(str.charAt(i)+32);
			}
			else {
				res=res+str.charAt(i);
			}
		}
		return res;
	}
	public static char[] tocharArray(String str)
	{
		char[] s=new char[str.length()];
		for(int i=0;i<s.length;i++)
		{
			s[i]=str.charAt(i);
		}
		return s;
	}
	public static char[] sort(char[] ch)
	{
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		return ch;
	}
	
	public static void main(String[] args) {
		System.out.println(check("triangle","integral"));
	}

}
