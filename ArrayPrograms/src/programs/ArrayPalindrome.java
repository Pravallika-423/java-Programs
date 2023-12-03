package programs;

public class ArrayPalindrome {

	
		public static int palinArray(int[] a)
	           {
	                  //add code here.
	                  int c=0;
	                  for(int i=0;i<a.length;i++)
	                  {
	                      if(palin(a[i]))
	                      {
	                          c++;
	                      }
	                  }
	                  if(c==a.length)
	                  {
	                      return 1;
	                  }
	                  return 0;
	                  
	           }
	           public static boolean palin(int n)
	           {
	               int temp=n;
	               int rev=0;
	               while(n>0)
	               {
	                   int r=n%10;
	                   rev=rev*10+r;
	                   n=n/10;
	               }
	               if(temp==rev)
	               {
	                   return true;
	               }
	               return false;
	           }
	           public static void main(String[] args) {
	        	   int[] a= {111,222,333,444,655};
				System.out.println(palinArray(a));
			}
	           
	}


