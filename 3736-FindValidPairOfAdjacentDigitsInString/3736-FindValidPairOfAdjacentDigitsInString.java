// Last updated: 27/08/2025, 23:21:20
class Solution {
    public String findValidPair(String s) {
        int[] arr = new int[999];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - '0'] = arr[s.charAt(i) - '0'] + 1;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            int thakur1 = s.charAt(i) - '0';
            int thakur2 = s.charAt(i + 1) - '0';
            if (thakur1 != thakur2 && arr[thakur1] == thakur1 && arr[thakur2] == thakur2) {
                return s.substring(i, i + 2);
            }
        }

        return "";
    }
}
