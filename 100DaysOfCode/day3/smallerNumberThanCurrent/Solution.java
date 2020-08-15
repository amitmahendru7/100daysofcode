package smallerNumberThanCurrent;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] arr= {8,1,2,2,3};
		System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));

	}
	
public static int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] count=new int[101];
        int[] res= new int[nums.length];
        
        for (int i =0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        
        for (int i = 1 ; i <= 100; i++) {
            count[i] += count[i-1];    
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                res[i] = 0;
            else 
                res[i] = count[nums[i] - 1];
        }
        
        return res;        
    }

}
