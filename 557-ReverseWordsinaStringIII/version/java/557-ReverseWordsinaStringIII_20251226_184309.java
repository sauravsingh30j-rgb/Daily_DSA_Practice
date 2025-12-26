// Last updated: 26/12/2025, 18:43:09
1class Solution {
2    public String reverseWords(String s) {
3        String[] words = s.split(" ");
4        for (int i = 0; i < words.length; i++) {
5            words[i] = rev(words[i]);
6        }
7        return String.join(" ", words);
8    }
9    
10    public String rev(String p) {
11        String o = "";
12        for (int i = p.length() - 1; i >= 0; i--) {
13            o += p.charAt(i);
14        }
15        return o;
16    }
17}