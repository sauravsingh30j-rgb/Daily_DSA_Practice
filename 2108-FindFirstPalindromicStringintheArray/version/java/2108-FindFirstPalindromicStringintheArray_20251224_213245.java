// Last updated: 24/12/2025, 21:32:45
1public class Solution {
2    public static String firstPalindrome(String[] words) {
3        for (String word : words) {
4            StringBuilder reversed = new StringBuilder(word).reverse();
5            if (word.equals(reversed.toString())) {
6                return word;
7            }
8        }
9        return "";
10    }
11}