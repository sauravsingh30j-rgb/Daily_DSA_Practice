// Last updated: 27/08/2025, 23:21:27
class Solution {
    public int scoreOfString(String s) {
        int sum=0;
            for(int i=0;i<s.length()-1;i++)
            {
                int n=s.charAt(i);
                int m=s.charAt(i+1);
                if(n>m)
                {
                    sum=sum+(n-m);
                }
                else
                {
                    sum=sum+(m-n);
                }
            }
            return sum;
    }
}