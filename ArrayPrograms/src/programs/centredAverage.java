package programs;

public class centredAverage {
public static void main(String[] args) {
	int[] nums= {1,2,3,4,100};
	  int max=0;int min=0;int sum=0;int avg=0;int c=0;
	  for(int i=0;i<nums.length;i++){
	    if(nums[i]>max)
	    {
	      max=nums[i];
	    }
	    if(nums[i]<min)
	    {
	      min=nums[i];
	    }
	  }
	  for(int i=0;i<nums.length;i++)
	  {
	    if(nums[i]!=max || nums[i]!=min){
	    sum=sum+nums[i];}
	  }
	  avg=sum/(nums.length)-2;
	  System.out.println(sum);
	  System.err.println(avg);
}
}
