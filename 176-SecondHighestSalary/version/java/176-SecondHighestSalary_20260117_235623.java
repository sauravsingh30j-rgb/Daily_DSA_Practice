// Last updated: 17/01/2026, 23:56:23
1class Solution {
2    public int titleToNumber(String columnTitle) {
3        int ans = 0 ;
4        for(int i=0 ; i<columnTitle.length();i++){
5            char a = columnTitle.charAt(i);
6            int value = a - 'A' + 1;
7            ans = ans*26 + value ;
8        }
9        return ans;
10    }
11}