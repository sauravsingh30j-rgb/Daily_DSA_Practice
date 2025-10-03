// Last updated: 04/10/2025, 01:42:45

class Solution {
    public int[] findDiagonalOrder(int[][] nums) {
        int m = nums.length, n = nums[0].length;
        int[] res = new int[m * n];
        int idx = 0;
        
        boolean reverse = true;
        
        for (int d = 0; d < m + n - 1; d++) {
            int i = d < n ? 0 : d - n + 1;
            int j = d < n ? d : n - 1;
            
            List<Integer> temp = new ArrayList<>();
            
            while (i < m && j >= 0) {
                temp.add(nums[i][j]);
                i++;
                j--;
            }
            
            if (reverse) {
                Collections.reverse(temp);
            }
            
            reverse = !reverse;
            
            for (int num : temp) {
                res[idx++] = num;
            }
        }
        
        return res;
    }
}
