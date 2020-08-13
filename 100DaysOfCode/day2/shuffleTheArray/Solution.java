package shuffleTheArray;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int arr[]= {2,5,1,3,4,7};
		System.out.println(Arrays.toString(shuffle(arr, 3)));

	}
	public static int[] shuffle(int[] nums, int n) {
        //Edge Case
        if(nums.length!=2*n || n==0)
            return null;
        int[] outp=new int[2*n];
        for(int i=0;i<n;i++){
            outp[2*i]=nums[i];
            outp[2*i+1]=nums[n+i];
        }
        return outp;
    }
}
