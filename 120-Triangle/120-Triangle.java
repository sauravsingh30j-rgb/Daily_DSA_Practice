// Last updated: 04/10/2025, 01:45:01
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = triangle.get(n - 1).get(i);
        for (int i = n - 2; i >= 0; i--)
            for (int j = 0; j <= i; j++)
                arr[j] = Math.min(arr[j], arr[j + 1]) + triangle.get(i).get(j);

        return arr[0];
    }
}