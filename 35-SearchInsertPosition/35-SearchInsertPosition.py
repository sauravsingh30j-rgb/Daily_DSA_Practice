# Last updated: 04/10/2025, 01:46:19
class Solution(object):
    def searchInsert(self, nums, t):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        if t in nums:
          return nums.index(t)  
        else:
           nums.append(t)
           y=sorted(nums)
           return y.index(t)