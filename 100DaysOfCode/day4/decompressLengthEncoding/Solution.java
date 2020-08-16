package decompressLengthEncoding;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
	int[] arr= {1,2,3,4};
	System.out.println(Arrays.toString(decompressRLElist(arr)));
	

	}
	 public static int[] decompressRLElist(int[] nums) {
	        
		    //edge case
		        if(nums.length % 2!=0)
		            return null;
		    //Now we need to find output array size
		        int outSize=0;
		        for(int i=0;i<nums.length;i=i+2)
		            outSize=outSize+nums[i];
		        //Now we create a new array
		        int[] outP=new int[outSize];
		        int start=0;
		        for(int i=0;i<nums.length;i=i+2){
		            Arrays.fill(outP,start,start+nums[i],nums[i+1]);
		            start=start+nums[i];
		        }
		            return outP;
		    }
}
