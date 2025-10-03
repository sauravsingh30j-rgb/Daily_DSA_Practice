// Last updated: 04/10/2025, 01:42:51
class Solution {
public:
    string addStrings(string num1, string num2) {
        int i = num1.size() - 1;
        int j = num2.size() - 1;
        int carry = 0;
        string result;
        
        while (i >= 0 || j >= 0 || carry) {
            int sum = carry;
            if (i >= 0) sum += num1[i--] - '0';
            if (j >= 0) sum += num2[j--] - '0';
            result.push_back(sum % 10 + '0');
            carry = sum / 10;
        }
        
        reverse(result.begin(), result.end());
        return result;
    }
};
