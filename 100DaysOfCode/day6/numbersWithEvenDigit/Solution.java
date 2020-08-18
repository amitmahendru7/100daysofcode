package numbersWithEvenDigit;

public class Solution {

	public static void main(String[] args) {
		int[] nums= {12,345,2,6,7896,100000};
		System.out.println(findNumbers(nums));

	}
	
	 public static int findNumbers(int[] nums) {
	        //Edge Case
	        if(nums.length==0)
	            return 0;
	        int counter=0;
	        for(int i=0;i<nums.length;i++){
	            if((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000) || (nums[i]==100000)){
	                counter++;
	            }
	        }
	        return counter;
	            
	      
	        
	    }

}
