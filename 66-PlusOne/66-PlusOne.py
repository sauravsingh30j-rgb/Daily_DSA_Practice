# Last updated: 04/10/2025, 01:45:53
class Solution(object):
    def plusOne(self, l):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
       #l=[1,2,3,4]
        s="".join(map(str,l))
        su=int(s)+1
        #print(int(s)+1)
        num=str(su)
        l2=[]
        for i in num:
         l2.append(int(i))
        return l2