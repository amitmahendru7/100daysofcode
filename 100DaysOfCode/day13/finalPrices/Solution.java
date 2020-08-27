package finalPrices;

import java.util.Arrays;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		int[] prices= {8,4,6,2,3};
		System.out.println(Arrays.toString(finalPrices(prices)));
		

	}
	
	 public static int[] finalPrices(int[] prices) {
	        Stack<Integer> stack = new Stack<>();
	        for (int i = 0; i < prices.length; i++) {
	            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i])
	                prices[stack.pop()] -= prices[i];
	            stack.push(i);
	        }
	        return prices;
	        
	    }

}
