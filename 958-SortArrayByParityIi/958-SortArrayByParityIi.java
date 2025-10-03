// Last updated: 04/10/2025, 01:42:14
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] arr = new int[nums.length / 2];
        int[] arr1 = new int[nums.length / 2];
        int[] las = new int[nums.length];
        int k = 0, l = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                arr[k++] = nums[i];
            } else {
                arr1[l++] = nums[i];
            }
        }

        Arrays.sort(arr);
        Arrays.sort(arr1);
int m=0;int n=0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                las[i] = arr[m];
                m=m+1;
            } else {
                las[i] = arr1[n];
                n=n+1;
            }
        }

        return las;
    }
}


