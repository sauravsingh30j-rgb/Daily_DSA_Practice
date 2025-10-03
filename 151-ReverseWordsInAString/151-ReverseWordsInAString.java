// Last updated: 04/10/2025, 01:44:29
class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        String p = "";
        for (int i = words.length - 1; i >= 0; i--) {
            if (i != 0) {
                p += words[i] + " ";
            } else {
                p += words[i];
            }

        }
        return p;
    }
}
