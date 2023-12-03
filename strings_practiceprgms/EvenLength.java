package practiceprgms;

public class EvenLength {

	public static void print(String str)
	{
		String[] s=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			if((s[i].length())%2==0)
			{
				System.out.println(s[i]);
			}
		}
	}
	public static void main(String[] args) {
		print("this is a string");
	}
	
}
