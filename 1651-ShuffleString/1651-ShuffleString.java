// Last updated: 04/10/2025, 01:42:00

public class Solution {
    public String restoreString(String s, int[] indices) {
        char[] res = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            res[indices[i]] = s.charAt(i);
        }
        return new String(res);
    }
}
