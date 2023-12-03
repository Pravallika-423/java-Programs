package practiceprgms;

public class HardWord {

	public static int print(String str)
	{
		char[] ch=new char[str.length()];
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=str.charAt(i);
		}
		int v=0;
		
		int c=0;
		int hard=0;
		int easy=0;
		for(int i=0;i<ch.length;i++)
		{
			while(ch[i]!=' ')
			{
				
			}
//			if(ch[i]!=' '&&ch[i]=='a'|| ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
//			{
//				v++;
//			}
//			else {
//				c++;
//			}
//			if(ch[i]!=' '&&ch[i]!='a'|| ch[i]!='e'||ch[i]!='i'||ch[i]!='o'||ch[i]!='u' && ch[i+1]!='a'|| ch[i+1]!='e'||ch[i+1]!='i'||ch[i+1]!='o'||ch[i+1]!='u'
//					&&  ch[i+2]!='a'|| ch[i+2]!='e'||ch[i+2]!='i'||ch[i+2]!='o'||ch[i+2]!='u')
//			{
//				hard++;
//			}
//			if(v>c)
//			{
//				easy++;
//			}
//			
//			else {
//				hard++;
//			}
		}
		System.out.println(v);
		System.out.println(c);
//		int hard=0;
//		int easy=0;
//		if(v>c)
//		{
//			easy++;
//		}
//		
//		else {
//			hard++;
//		}
		System.out.println(easy);
		System.out.println(hard);
		int res=(5*hard)-(2*easy);
		return res;
	}
	public static void main(String[] args) {
		System.out.println(print("qiewldoaa life ace by fantasy"));
	}
}
