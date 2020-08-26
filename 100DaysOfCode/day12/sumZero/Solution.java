package sumZero;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(Arrays.toString(sumZero(n)));

	}
	public static int[] sumZero(int n) {
        int[] A = new int[n];
        for (int i = 0; i < n; ++i)
            A[i] = i * 2 - n + 1;
        return A;
        
    }

}
