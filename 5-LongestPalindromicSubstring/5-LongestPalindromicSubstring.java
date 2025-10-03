// Last updated: 04/10/2025, 01:46:51
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        // Step 1: Transform the input string in-place (avoiding extra function call)
        StringBuilder sPrime = new StringBuilder("#");
        for (char c : s.toCharArray()) {
            sPrime.append(c).append("#");
        }

        int n = sPrime.length();
        int[] palindromeRadii = new int[n]; // Stores palindrome radius at each index
        int center = 0, rightBoundary = 0;  // Current center and rightmost boundary
        int maxLength = 0, centerIndex = 0;

        // Step 2: Process each character
        for (int i = 0; i < n; i++) {
            int mirror = 2 * center - i;

            // Step 3: Use mirror property if within boundary
            if (i < rightBoundary) {
                palindromeRadii[i] = Math.min(rightBoundary - i, palindromeRadii[mirror]);
            }

            // Step 4: Expand around the current center
            while (i + 1 + palindromeRadii[i] < n &&
                   i - 1 - palindromeRadii[i] >= 0 &&
                   sPrime.charAt(i + 1 + palindromeRadii[i]) == sPrime.charAt(i - 1 - palindromeRadii[i])) {
                palindromeRadii[i]++;
            }
            
            // Step 5: Find the longest palindrome
            if (palindromeRadii[i] > maxLength) {
                maxLength = palindromeRadii[i];
                centerIndex = i;
            }

            // Step 6: Update center and right boundary if expanded
            if (i + palindromeRadii[i] > rightBoundary) {
                center = i;
                rightBoundary = i + palindromeRadii[i];
            }
        }


        // Step 7: Extract longest palindrome from original string
        int startIndex = (centerIndex - maxLength) / 2;
        return s.substring(startIndex, startIndex + maxLength);
    }
}