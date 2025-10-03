// Last updated: 04/10/2025, 01:43:13
class Solution {
public void reverseString(char[] s) {
int left = 0, right = s.length - 1;
while (left < right) {
char temp = s[left];
s[left] = s[right];
s[right] = temp;
left++;
right--;
}
}
}