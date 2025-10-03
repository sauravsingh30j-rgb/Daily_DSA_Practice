// Last updated: 04/10/2025, 01:46:13
// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         int fina=0;
//         if(nums.length==1){
//            if(target<=nums[0]){
//             return 0;
//            }
//         }
//         if(target>=nums[nums.length-1]){
//             return nums.length;
//         }
//         for(int i=0;i<nums.length;i++)
//         {
//         if( nums[i]>= target)
//         {
//       fina=i;
//       break;
//         }
//     }
//       return fina;
//     }}
// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         int fina = 0;
//         if (target <= nums[0]) {
//             return 0;
//         }
//         if (target >= nums[nums.length - 1]) {
//             return nums.length;
//         }
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] >= target) {
//                 fina = i;
//                 break;
//             }
//         }
//         return fina;
//     }
// }


class Solution {
    public int searchInsert(int[] nums, int target) {
        int fina = 0;
        if (target <= nums[0]) {
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                fina = i;
                break;
            }
        }
        return fina;
    }
}

