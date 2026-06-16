// Last updated: 17/06/2026, 00:26:36
1class Solution {
2    public boolean validPalindrome(String s) {
3        int i = 0;
4        int j = s.length() - 1;
5        
6        while(i <= j){
7            if(s.charAt(i) == s.charAt(j)){
8                i++;
9                j--;
10            }
11            else return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
12        }
13        return true;
14    }
15    public boolean isPalindrome(String s, int i, int j){
16        while(i <= j){
17            if(s.charAt(i) == s.charAt(j)){
18                i++;
19                j--;
20            }
21            else return false;
22        }
23        return true;
24    }
25}