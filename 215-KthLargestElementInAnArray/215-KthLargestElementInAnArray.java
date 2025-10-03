// Last updated: 04/10/2025, 01:44:03
class Solution {
    public int findKthLargest(int[] arr, int k) {
        Arrays.sort(arr);
        int n=arr.length-k;
        return arr[n];
    }
}