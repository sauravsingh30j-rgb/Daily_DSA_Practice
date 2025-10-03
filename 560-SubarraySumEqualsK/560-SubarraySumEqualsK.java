// Last updated: 04/10/2025, 01:42:36
class Solution {
    public int subarraySum(int[] arr, int p) {
        int sum=0;;
        int count=0;
    int n=arr.length;
    for (int i = 0; i < n; i++) {
       
      for (int j = i; j < n; j++) {
         sum=sum+arr[j];
         if(sum==p)
         {
            count++;
            
         }
        }
        sum=0;
      }
return count;
}}