# Last updated: 04/10/2025, 01:47:00
'''class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        k = []
        p = 0

        for i in nums1:
            k.append(i)
        for j in nums2:
            k.append(j)

        k.sort()
        for u in range(1, len(k) + 1):
            p = p + 1

        if p % 2 == 0:
            n = p // 2
            median = (k[n - 1] + k[n]) / 2
            return float('{:.5f}'.format(median))
        else:
            n = p // 2
            return float('{:.5f}'.format(k[n]))'''

''' Example usage:
solution = Solution()
nums1 = [1, 3]
nums2 = [2]
print(solution.findMedianSortedArrays(nums1, nums2))  # Output: 2.0
'''
class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        k = []
        p = 0

        for i in nums1:
            k.append(i)
        for j in nums2:
            k.append(j)

        k.sort()
        for u in range(1, len(k) + 1):
            p = p + 1

        if p % 2 == 0:
            n = p // 2
            median = (k[n - 1] + k[n]) / 2.0
            return median
        else:
            n = p // 2
            return float(k[n])

