// Last updated: 04/10/2025, 01:45:51
class Solution {
    public int[][] generateMatrix(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        int[][] arr = new int[n][n];
        for (int i = 1; i <= n * n; i++) {
            a.add(i);
        }
        int j = 0;
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                arr[top][i] = a.get(j);
                j++;
            }
            top++;




            for (int i = top; i <= bottom; i++) {
                arr[i][right] = a.get(j);
                j++;
            }
            right--;



            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    arr[bottom][i] = a.get(j);
                    j++;
                }
                bottom--;
            }



            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = a.get(j);
                    j++;
                }
                left++;
            }
        }

        return arr;

    }
}