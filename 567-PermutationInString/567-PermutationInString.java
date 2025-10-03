// Last updated: 04/10/2025, 01:42:34
public class Solution {
public boolean checkInclusion(String s1, String s2) {
    if (s1.length() > s2.length()) return false;
    String sortedS1 = sort(s1);
    for (int i = 0; i <= s2.length() - s1.length(); i++) {
      String substr = s2.substring(i, i + s1.length());
      if (sortedS1.equals(sort(substr))) return true;
    }
    return false;
  }
  private String sort(String s) {
    char[] arr = s.toCharArray();
    Arrays.sort(arr);
    return new String(arr);
  }
}
