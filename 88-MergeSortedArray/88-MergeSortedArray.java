// Last updated: 04/10/2025, 01:45:28
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < m; i++) {

            a.add(nums1[i]);

        }
        for (int i = 0; i < n; i++) {

            a.add(nums2[i]);

        }
        Collections.sort(a);
        for (int i = 0; i < a.size(); i++) {
            nums1[i] = a.get(i);
        }

    }
}
