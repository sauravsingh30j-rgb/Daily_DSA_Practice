// Last updated: 02/02/2026, 00:32:27
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int row=matrix.length;
4        int column=matrix[0].length;
5        boolean ans=false;
6        for(int i=0;i<row;i++)
7        {
8            for(int j=0;j<column;j++)
9            {
10                if(matrix[i][j]==target)
11
12                {
13                    ans= true;
14                }
15            }
16        }
17        return ans;
18    }
19}