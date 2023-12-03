package programs;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] nums= {0,1,1,2,2,3,4};
		  for(int i=0;i<nums.length-1;i++){
	            for(int j=i+1;j<nums.length;j++){
	            if(nums[i]==nums[j]){
	                nums[j]=-1;
	            }
	        }
	        }
	        for(int i=0;i<nums.length;i++){
	            for(int j=i+1;j<nums.length;j++){
	                if(nums[i]<nums[j]){
	                    int t=nums[i];
	                    nums[i]=nums[j];
	                    nums[j]=t;
	                }
	            }
	        }
		    for(int e:nums) {
		    	System.out.print(e+" ");
		    }
		    System.out.println();
	        
	        int[] arr=new int[nums.length];
		    int j=arr.length-1;
		    for(int i=0;i<nums.length;i++){
		        arr[j]=nums[i];
		        j--;
		    }
	        int c=0;
	        for(int i=0;i<arr.length;i++){
	        if(arr[i]!=-1){
	            c++;
	        }
	    }
		    
		    for(int e:arr) {
		    	System.out.print(e+" ");
		    }
	}
	
}
