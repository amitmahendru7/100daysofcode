package runningSum1DArray;

import java.util.Arrays;

import arrayImplementation.Array;

public class TestClass {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
	}
	
	public static int[] runningSum(int[] nums) {
        
        //edge case for 1 or zero element
        if(nums.length==0 || nums.length==1)
            return nums;
        //Define a outout array
        int[] outp=new int[nums.length];
        int temp=0;
        for(int i=0;i<nums.length;i++){
            outp[i]=temp+nums[i];
            temp=temp+nums[i];
        }
        return outp;
    }

}
