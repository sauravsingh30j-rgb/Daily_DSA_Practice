// Last updated: 27/08/2025, 23:21:44
class Solution {
    public boolean checkIfPangram(String p) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String uniqueChars = "";

        // Iterate through each character in the input string p
        for (int i = 0; i < p.length(); i++) {
            // Check if the character is not already in uniqueChars
            if (uniqueChars.indexOf(p.charAt(i)) == -1) {
                uniqueChars += p.charAt(i);
            }
        }

        // Check if the length of uniqueChars equals the length of the alphabet
        if(uniqueChars.length() == alphabet.length())
        {
           return true; 
        }
        else
        { return false;
        }
    }
}
