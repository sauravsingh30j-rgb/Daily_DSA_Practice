// Last updated: 04/10/2025, 01:42:11
class Solution {
    public int fib(int n) {
        return ans( n);
        
    }
    public int ans(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        
        return ans(n-1)+ans(n-2);
    }
}