// Last updated: 04/10/2025, 01:42:06
class Solution {
    public int findSpecialInteger(int[] arr) {
        int t=arr.length;
        int count=1;
        for(int i=1;i<t;i++){
            if(arr[i]==arr[i-1]){
                count++;
                if(count>t/4){
                    return arr[i];
                }
            }
                else{
                    count=1;

                }
        
            }
        return arr[0];
        
    }
}