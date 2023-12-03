package practiceprgms;

public class SwapChars {

	public static String print(String str)
	{
		char[] ch=tocharArr(str);

		for(int i=0;i<ch.length-1;i=i+2)
		{
				char temp=ch[i];
				ch[i]=ch[i+1];
				ch[i+1]=temp;
		}
			
		String res="";
		for(int i=0;i<ch.length;i++)
		{
			res=res+ch[i];
		}
		return res;
	}
	
	public static char[] tocharArr(String str)
	{
		char[] ch = new char[str.length()];
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=str.charAt(i);
		}
		return ch;
	}
	
	public static void main(String[] args) {
		System.out.println(print("javasad"));
	}
}
