// Last updated: 04/10/2025, 01:43:12
class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        while (i < j) {
            char c = sb.charAt(i);
            char h = sb.charAt(j);
            while ((i < j) && (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'A' && c != 'E'
                    && c != 'I' && c != 'O' && c != 'U')) {
                i++;
                c = sb.charAt(i);
            }
            while ((i < j) && (h != 'a' && h != 'e' && h != 'i' && h != 'o' && h != 'u' && h != 'A' && h != 'E'
                    && h != 'I' && h != 'O' && h != 'U')) {
                j--;
                h = sb.charAt(j);
            }
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        String p = sb.toString();
        return p;
    }
}