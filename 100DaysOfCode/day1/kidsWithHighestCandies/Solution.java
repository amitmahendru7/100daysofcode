package kidsWithHighestCandies;

import java.util.ArrayList;

import java.util.List;

public class Solution {

	public static void main(String[] args) {
		int arr[]= {1,3,5,1,3};
        System.out.println(kidsWithCandies(arr,3));

	}
	
	 public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	        
	        //EDge case if Array is null
	        if(candies.length==0)
	            return null;
	        //find maximum
	        int max=0;
	        for(int i=0;i<candies.length;i++){
	            if(max<=candies[i])
	                max=candies[i];
	        }
	        List<Boolean> outp=new ArrayList<Boolean>();
	        for(int i=0;i<candies.length;i++){
	            if(candies[i]+extraCandies>=max)
	                outp.add(true);
	            else
	                outp.add(false);
	        }
	         return outp;
	        }
	   

}
