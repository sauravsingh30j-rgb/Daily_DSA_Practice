// Last updated: 04/10/2025, 01:44:54
class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        s = s.toLowerCase();
        for(char ch : s.toCharArray()){
            if(ch >= 97 && ch <= 122 || ch >='0' && ch <= '9'){
                str += ch;
            }
        }
        if(str.length() <=1) return true;
       boolean res = false;
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}