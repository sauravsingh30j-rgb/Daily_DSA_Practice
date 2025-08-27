// Last updated: 27/08/2025, 23:21:40
class Solution {
    public String reversePrefix(String word, char c) {
        int index = word.indexOf(c);
        if (index == -1) {
            return word;
        }

        StringBuilder prefix = new StringBuilder(word.substring(0, index + 1)).reverse();
        String suffix = word.substring(index + 1);

        return prefix.toString() + suffix;
    }
}
