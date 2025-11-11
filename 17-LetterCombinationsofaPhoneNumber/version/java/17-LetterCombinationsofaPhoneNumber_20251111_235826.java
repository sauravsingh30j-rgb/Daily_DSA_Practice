// Last updated: 11/11/2025, 23:58:26
class Solution {
    String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty())
            return result;
        print(digits, "");
        return result;
    }

    public void print(String ques, String ans) {
        if (ques.length() == 0) {
            result.add(ans);
            return;
        }
        char ch = ques.charAt(0);
        String getString = key[ch - '0'];
        for (int i = 0; i < getString.length(); i++) {
            print(ques.substring(1), ans + getString.charAt(i));
        }
    }
}
