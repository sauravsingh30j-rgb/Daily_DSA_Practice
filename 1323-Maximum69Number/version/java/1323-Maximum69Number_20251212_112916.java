// Last updated: 12/12/2025, 11:29:16
1class Solution {
2   public int maximum69Number (int num) {
3       String s = Integer.toString(num);
4       String replaced = s.replaceFirst("6", "9");
5       return Integer.parseInt(replaced);
6       
7   }
8}