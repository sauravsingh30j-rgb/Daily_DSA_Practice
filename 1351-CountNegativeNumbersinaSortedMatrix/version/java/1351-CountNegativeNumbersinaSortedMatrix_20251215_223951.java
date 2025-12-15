// Last updated: 15/12/2025, 22:39:51
1class Solution {
2    public int countNegatives(int[][] grid) {
3        int ans = 0;
4        for(int i = grid.length-1; i >= 0; i--){
5            for(int j = grid[0].length-1; j >= 0; j--){
6                if(grid[i][j] >= 0)break;
7                ans++;
8            }
9        }
10        return ans;
11    }
12}