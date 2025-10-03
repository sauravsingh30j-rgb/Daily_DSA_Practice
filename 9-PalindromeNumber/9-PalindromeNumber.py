# Last updated: 04/10/2025, 01:46:53
class Solution(object):
    def isPalindrome(self, x):
     p=str(x)
     if p==p[::-1]:
       return True
     else:
        return False
        