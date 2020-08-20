package cellsWithOddValues;

public class Solution {

	public static void main(String[] args) {
		int n=2;
		int m=3;
		int[][] indices= {{0,1},{1,1}};
		System.out.println(oddCells(n, m, indices));

	}
	
	public static int oddCells(int n, int m, int[][] indices) {
        boolean[] oddRows = new boolean[n], oddCols = new boolean[m];
        int cntRow = 0, cntCol = 0;
        for (int[] idx : indices) {
            oddRows[idx[0]] ^= true;
            oddCols[idx[1]] ^= true;
        }
        for (boolean r : oddRows)
            cntRow += r ? 1 : 0;
        for (boolean c : oddCols)
            cntCol += c ? 1 : 0;
        // return m * cntRow + n * cntCol - 2 * cntRow * cntCol;
        return (m - cntCol) * cntRow + (n - cntRow) * cntCol;
        
    }

}
