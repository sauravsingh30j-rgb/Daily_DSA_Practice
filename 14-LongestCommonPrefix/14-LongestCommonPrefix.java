// Last updated: 04/10/2025, 01:46:43
class Solution {
    public String longestCommonPrefix(String[] strs) {
        boolean chk = true;
        String s = "";
        Character c;
        Arrays.sort(strs);
        for(int i = 0; i<strs[0].length() ; i++) {
            c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != c) {
                    chk = false;
                    break;
                }
            }
            if (chk == true)
                s += c;
            if (chk == false)
                break;
        }
        return s;
    }
}