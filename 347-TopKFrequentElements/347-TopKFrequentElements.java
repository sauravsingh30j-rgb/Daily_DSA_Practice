// Last updated: 04/10/2025, 01:43:10

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            b.add(nums[i]);
        }
        ArrayList<Integer> unique = new ArrayList<>();
        for (int num : b) {
            if (!unique.contains(num)) {
                unique.add(num);
            }
        }
        ArrayList<Integer> frequency = new ArrayList<>();
        for (int num : unique) {
            int count = 0;
            for (int i = 0; i < b.size(); i++) {
                if (num == b.get(i)) {
                    count++;
                }
            }
            frequency.add(count);
        }
        int[] arr = new int[k];
        int l = 0;
        while (l < k) {
            int index = find_max(frequency);
            arr[l] = unique.get(index);
            frequency.remove(index);
            unique.remove(index);
            l++;
        }
        return arr;
    }

    public int find_max(ArrayList<Integer> list) {
        int max = -99;
        int ret = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
                ret = i;
            }
        }
        return ret;}}