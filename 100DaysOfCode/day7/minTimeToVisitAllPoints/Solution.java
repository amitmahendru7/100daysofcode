package minTimeToVisitAllPoints;



public class Solution {

	public static void main(String[] args) {
		int[][] arr = { { 1, 1 }, { 3, 4 }, {-1,0}};
		System.out.println(minTimeToVisitAllPoints(arr));

	}
	public static int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
       for (int i = 1; i < points.length; ++i) {
           int[] cur = points[i], prev = points[i - 1];
           ans += Math.max(Math.abs(cur[0] - prev[0]), Math.abs(cur[1] - prev[1]));
       }
       return ans;   
       
   }

}
