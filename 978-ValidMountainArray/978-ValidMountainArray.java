// Last updated: 04/10/2025, 01:42:13
class Solution {
    public boolean validMountainArray(int[] arr) {
        int max=Integer.MIN_VALUE;
       int indx=0;
       if(arr.length<3){
        return false;
       }
     for (int i=0; i<arr.length ; i++)
     {
       if (arr[i]>max)
       {
        max=arr[i];
        indx=i;
       }
     }
   if (indx==0 || indx==arr.length-1)
   {return false;
   }
       for (int i = 0; i < indx; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        } 
        for (int i = indx; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                return false;
            }
        }
     return true;
    
}
}