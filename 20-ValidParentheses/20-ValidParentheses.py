# Last updated: 04/10/2025, 01:46:41
class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []
        mapping = {")": "(", "}": "{", "]": "["}
        
        for char in s:
            if char in mapping:
                # If the current character is a closing bracket
                top_element = stack.pop() if stack else '#'  # Pop the top element from the stack, if not empty
                if mapping[char] != top_element:
                    return False  # If the top element does not match the corresponding opening bracket, return False
            else:
                stack.append(char)  # If the current character is an opening bracket, push it onto the stack
        
        return not stack  # If the stack is empty, all brackets were properly matched, return True; otherwise, return False

