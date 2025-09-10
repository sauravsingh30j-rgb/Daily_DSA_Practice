// Last updated: 10/09/2025, 16:53:04
// sort character by frequency

class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        List<Character>[] bucket = new ArrayList[s.length() + 1];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (int i = 0; i < 128; i++) {
            if (freq[i] > 0) {
                bucket[freq[i]].add((char) i);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = bucket.length - 1; i >= 0; i--) {
            for (char c : bucket[i]) {
                for (int j = 0; j < i; j++) {
                    sb.append(c);
                }
            }
        }

        return sb.toString();}}