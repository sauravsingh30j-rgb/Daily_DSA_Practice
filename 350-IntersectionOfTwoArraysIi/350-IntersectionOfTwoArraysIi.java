// Last updated: 04/10/2025, 01:43:07
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    a.add(nums1[i]);
                    nums2[j] = Integer.MIN_VALUE; 
                    break;
                }
            }
        }
        int[] arr = new int[a.size()];
        for (int k = 0; k < a.size(); k++) {
            arr[k] = a.get(k);
        }
        return arr;
    }
}