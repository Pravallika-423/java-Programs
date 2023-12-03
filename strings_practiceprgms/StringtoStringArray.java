package practiceprgms;

public class StringtoStringArray {

	
	
		public static String[] print(String str) {
			
			int n=count(str);
			String[] s=new String[n];
			for(int i=0;i<s.length;i++)
			{
				if(str.charAt(i)!=' ')
				{
					s[i]=str.charAt(i)+"";
				}
				
			}
			for(String e:s)
			{
				System.out.println(e);
			}
			return s;
		
	}
		public static int count( String str)
		{
			int c=0;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)==' ')
				{
					c++;
				}
			}
			return c+1;
		}
		public static void main(String[] args) {
			String str="this is a string";
			int n=count(str);
			System.out.println(n);
			String[] s=new String[n];
			s=print(str);
			
			
			
		}
}


