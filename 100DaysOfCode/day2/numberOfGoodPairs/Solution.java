package numberOfGoodPairs;


import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		int arr[]= {1,3,3,1,1,3};
		System.out.println(numIdenticalPairs(arr));

	}


	    public static int numIdenticalPairs(int[] nums) {
	        //edge case handler
	        if(nums.length==0 || nums.length==1)
	            return 0;
	        //define the counter
	        int counter=0;
	        //define a HashMap
	        Map<Integer, Integer> countTable = new HashMap<>(); 
	        for(int i=0; i<nums.length;i++){
	            counter=counter+countTable.getOrDefault(nums[i],0);
	            countTable.put(nums[i],countTable.getOrDefault(nums[i],0)+1);
	                
	        }
	        return counter;
	    }
}
