// Last updated: 04/10/2025, 01:42:55
class Solution {
    public int firstUniqChar(String s) {
        ArrayList<Integer> arr = new ArrayList<>();
        int ans;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            for (int j = 0; j < s.length(); j++) {
                if (i != j && c == s.charAt(j)) {
                    break;
                }
                if (j == s.length()-1) {
                    arr.add(i);
                }
            }
        }

        if (arr.size() == 0) {
            ans = -1;
        } else {
            ans = arr.get(0);
        }

        return ans;
    }
}
