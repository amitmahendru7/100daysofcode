package xorOperationsInArray;

public class Solution {

	public static void main(String[] args) {
		int n=5;
		int start =0;
		System.out.println(xorOperation(n, start));

	}
	
	 public static int xorOperation(int n, int start) {
	        //int[] arr=new int[n];
	        int output=0;
	        for (int i=0;i<n;i++){
	             int temp=start+2*i;
	            output=output^temp;
	        }
	           
	    return output; 
	    }

}
