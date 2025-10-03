// Last updated: 04/10/2025, 01:42:02
class Solution {
    public int numOfSubarrays(int[] arr) {
        int count = 0;
        int prefixSum = 0;
        int even = 1; 
        int odd = 0;
        int mod = 1000000007;

        for (int num : arr) {
            prefixSum += num;

            if (prefixSum % 2 == 0) {
                 count = (count + odd) % mod;
                even++;
            } else {
                 count = (count + even) % mod;
                odd++;
            }
        }

        return count;
    }
}
