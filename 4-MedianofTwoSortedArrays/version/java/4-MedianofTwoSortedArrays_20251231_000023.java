// Last updated: 31/12/2025, 00:00:23
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3       ArrayList<Integer> s = new ArrayList<>();
4        for (int i = 0; i < nums1.length; i++) {
5            s.add(nums1[i]);
6        }
7        for (int i = 0; i < nums2.length; i++) {
8            s.add(nums2[i]);
9        }
10        Collections.sort(s);
11        double ans;
12        int m = s.size() / 2;
13        if (s.size() % 2 == 0) {
14            ans = (double) (s.get(m - 1) + s.get(m)) / 2;
15        } else {
16            ans = (double) s.get(m);
17        }
18        return ans;
19
20    }
21}