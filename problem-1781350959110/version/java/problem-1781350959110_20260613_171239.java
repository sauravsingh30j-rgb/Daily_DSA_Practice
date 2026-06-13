// Last updated: 13/06/2026, 17:12:39
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1=0;
        int p2=0;
        Set<Integer> set=new HashSet<>();
        while(p1<n1 && p2<n2)
        {
            if(nums1[p1]==nums2[p2])
            {
                set.add(nums1[p1]);
                p1++;
                p2++;
            }
            else if(nums1[p1]<nums2[p2])
            {
                p1++;
            }
            else
            {
                p2++;
            }
        }
        int k=set.size();
        int[] res=new int[k];
        int cur=0;
        for(int x:set)
        {
            res[cur++]=x;
        }
        return res;

        
    }
}