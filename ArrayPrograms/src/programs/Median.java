package programs;
import java.util.Arrays;

public class Median {

  public int find_median(int[] a)
    {
        // Code here
	  	
      a=sort(a);
//      System.out.println(v);
      for(int e:a)
      {
    	  System.out.println(e);
      }
        for(int i=0;i<=a.length;i++)
        {
            if(a.length%2==0)
            {
                int mid=(a[(a.length/2) -1])+(a[((a.length+1)/2)-1]);
                return mid;
            }
//            return ((a.length/2)+1);
        }
        return ((a.length/2)+1);
    }
  public static int[] sort(int[] v)
  {
      for(int i=0;i<=v.length-1;i++)
      {
          for(int j=i+1;j<=v.length;j++)
          {
              if(v[i]>v[j])
              {
                  int t=v[i];
                   v[i]=v[j];
                  v[j]=t;
              }
          }
      }
      return v;
  }
  public static void main(String[] args) {
	  int[] a= {11,2,3,4,6};
	System.out.println(a);
}

}
