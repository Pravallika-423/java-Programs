package practiceprgms;

public class InsertNewString {

//	public static String print(String str,String new_str,int index)
//	{
//		String res="";
//		res=res+str.substring(0,index)+" "+new_str+str.substring(index);
//		return res;
//	}
	public static String print(String str,String new_str,int index) {
		String res="";
		for(int i=0;i<str.length();i++)
		{
			if(i==index)
			{
				res=res+" "+new_str;
			}
			res=res+str.charAt(i);
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		System.out.println(print("this String","is",4));
	}
}
