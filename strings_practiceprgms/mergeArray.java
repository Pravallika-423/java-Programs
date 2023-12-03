package practiceprgms;
import java.util.Arrays;
public class mergeArray {
public static void main(String[] args) {
	int[] a= {1,2,3};
	int[] b= {4,9,6};
	int j=0;
	int[] r=new int[a.length+b.length];
	for(int i=0;i<a.length;i++)
	{
		r[j]=a[i];
		j++;
	}
	for(int i=0;i<b.length;i++)
	{
		r[j]=b[i];
		j++;
	}
	Arrays.sort(r);
for(int i:r)
{
	System.out.println(i);
}

	

}
}