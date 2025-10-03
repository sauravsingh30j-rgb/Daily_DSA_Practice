// Last updated: 04/10/2025, 01:46:23
class Solution {
    public int strStr(String haystack, String needle) {
        String p = "";
        for (int i = 0; i < needle.length(); i++) {
            for (int j = 0; j < haystack.length(); j++) {
                if (needle.charAt(i) == haystack.charAt(j)) {
                    p = p + haystack.charAt(j);
                    break;
                }
            }
        }
        if (p.equals(needle)) {
            return haystack.indexOf(p);
        } else {
            return -1;
        }
    }
}
