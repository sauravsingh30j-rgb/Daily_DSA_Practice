// Last updated: 04/10/2025, 01:46:54
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       ArrayList<Integer> s = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            s.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            s.add(nums2[i]);
        }
        Collections.sort(s);
        double ans;
        int m = s.size() / 2;
        if (s.size() % 2 == 0) {
            ans = (double) (s.get(m - 1) + s.get(m)) / 2;
        } else {
            ans = (double) s.get(m);
        }
        return ans;

    }
}