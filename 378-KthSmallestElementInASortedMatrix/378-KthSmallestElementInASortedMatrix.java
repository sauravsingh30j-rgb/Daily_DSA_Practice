// Last updated: 04/10/2025, 01:43:00
class Solution {
    public int kthSmallest(int[][] matrix, int l) {
     

int rows = matrix.length;
int cols = matrix[0].length;
int[] nums = new int[rows * cols];
int k = 0;
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        nums[k] = matrix[i][j];
        k++;
    }
}

           Arrays.sort(nums);
           return nums[l-1];
    }
}