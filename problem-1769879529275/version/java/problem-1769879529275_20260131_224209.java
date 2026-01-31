// Last updated: 31/01/2026, 22:42:09
// trapping rain water
class Solution {
    public int trap(int[] arr) {
        int n=arr.length;

        int[] left=new int[n];
        int[] right=new int[n];

        // LEFT MAX ARRAY
        left[0]=arr[0];
        for (int i=1;i<n;i++) {
            left[i]=Math.max(left[i - 1],arr[i]);
        }

        // RIGHT MAX ARRAY
        right[n-1]=arr[n-1];
        for (int i=n-2;i>=0;i--) {
            right[i]=Math.max(right[i + 1], arr[i]);
        }
        int total=0;
        for(int i=0;i<=arr.length-1;i++){
            int leftdiff=left[i]-arr[i];
            int rightdiff=right[i]-arr[i];
            int water=Math.min(leftdiff,rightdiff);
            total=total+water;
        }
        return total;
    }
}