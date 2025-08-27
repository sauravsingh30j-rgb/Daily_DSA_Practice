// Last updated: 27/08/2025, 23:21:46
class Solution {
    public int findCenter(int[][] a) {
        int m= a[0][0];
        int n= a[0][1];
        int ans=n;
        if(a[1][0]==m || a[1][1]==m)
        {
            ans=m;
        }
        return ans;

        
    }
}