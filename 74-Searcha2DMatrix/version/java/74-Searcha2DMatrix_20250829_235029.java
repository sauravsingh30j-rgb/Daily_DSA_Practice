// Last updated: 29/08/2025, 23:50:29
// 2d array medium
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int column=matrix[0].length;
        for(int i=0;i<row;i++)
        {
            for(int k=0;k<column;k++)
            {
                if(matrix[i][k]==target)

                {
                    return true;
                }
            }
        }
        return false;
    }
}