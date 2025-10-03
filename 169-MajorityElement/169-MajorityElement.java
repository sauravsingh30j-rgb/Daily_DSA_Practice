// Last updated: 04/10/2025, 01:44:18
class Solution {
    public int majorityElement(int[] arr) {
       int e=arr[0];
       int v=1;
       for(int i=1;i<arr.length;i++)
       {
        if(arr[i]==e)
        {
            v++;
        }
        else{
            v--;
            if(v==0)
            {
                e=arr[i];
                v=1;
            }
        }
       }
       return e;
    }
}
 