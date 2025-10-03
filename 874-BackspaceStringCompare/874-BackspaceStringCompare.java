// Last updated: 04/10/2025, 01:42:19
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Boolean ans = false;
        String p = "";
        String q = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (p.length() > 0) {
                    p = p.substring(0, p.length() - 1);
                }
            } else {
                p += s.charAt(i);
            }
        }

        for (int j = 0; j < t.length(); j++) {
            if (t.charAt(j) == '#') {
                if (q.length() > 0) {
                    q = q.substring(0, q.length() - 1);
                }
            } else {
                q += t.charAt(j);
            }
        }

        if (p.equals(q)) {
            ans = true;
        }

        return ans;
    }
}
