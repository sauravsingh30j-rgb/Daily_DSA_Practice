# Last updated: 04/10/2025, 01:46:49
class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        INT_MAX = 2**31 - 1
        INT_MIN = -2**31
        
        if x >= 0:
            reversed_int = int(str(x)[::-1])
        else:
            reversed_int = -int(str(-x)[::-1])
        
        if reversed_int > INT_MAX or reversed_int < INT_MIN:
            return 0
        else:
            return reversed_int
