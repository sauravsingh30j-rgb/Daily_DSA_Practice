// Last updated: 04/10/2025, 01:45:40
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int column=matrix[0].length;
        boolean ans=false;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(matrix[i][j]==target)

                {
                    ans= true;
                }
            }
        }
        return ans;
    }
}