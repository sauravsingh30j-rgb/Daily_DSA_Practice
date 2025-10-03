// Last updated: 04/10/2025, 01:42:26
class Solution {
    //time: O(N log N), time: O(26)
    public String customSortString(String order, String s) {
        int[] val = new int[26];
        for (int i = 0; i < order.length(); i++) {
            val[order.charAt(i) - 'a'] = i + 1;
        }

        Character[] data = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            data[i] = s.charAt(i);// box
        }

        Arrays.sort(data, (a, b) -> {
            return val[a - 'a'] - val[b - 'a'];
        });

        StringBuilder sb = new StringBuilder();
        for (Character c : data) {
            sb.append(c);
        }
        return sb.toString();
    }
}