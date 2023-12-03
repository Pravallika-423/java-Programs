package practiceprgms;

public class maxelement {

	public static void main(String[] args) {
		int[] a= {1,2,34,567,90};
		int max=a[0];
		int pos=-1;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
					{
				max=a[i];
				pos=i;
					}
		}
		System.out.println(max); 
		System.out.println(pos);
		
	}
}
