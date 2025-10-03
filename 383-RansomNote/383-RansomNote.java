// Last updated: 04/10/2025, 01:42:58
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder s = new StringBuilder(ransomNote);
        StringBuilder p = new StringBuilder(magazine);
        int m = s.length();
        int n = p.length();
        StringBuilder r = new StringBuilder();
        boolean ans = false;

        for (int i = 0; i < m; i++) {
            char c = s.charAt(i);
            for (int j = 0; j < n; j++) {
                char h = p.charAt(j);
                if (c == h) {
                    r.append(c);
                    s.deleteCharAt(i);
                    p.deleteCharAt(j);
                    i--;
                    m--;
                    n--;
                    break;
                }
            }
        }

        if (ransomNote.equals(r.toString())) {
            ans = true;
        }
        return ans;
    }
}
