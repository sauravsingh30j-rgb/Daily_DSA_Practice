// Last updated: 04/10/2025, 01:46:07
class Solution {
    public int trap(int[] height) {
        int size=height.length;
        int [] arr2=new int[size];
        int [] arr3=new int[size];
        arr2[size-1]=height[size-1];
        for (int i=size-2;i>=0;i--) {
            if(arr2[i+1]>height[i]){
                arr2[i]=arr2[i+1];
            }
            else{
                arr2[i]=height[i];
            }  
        }
        arr3[0]=height[0];
        for(int i=1;i<size;i++){
            if(arr3[i-1]>height[i]){
                arr3[i]=arr3[i-1];
            }
            else{
                arr3[i]=height[i];
            }
        }
        int sum=0;
        for(int i=0;i<size;i++){
            int min=Math.min(arr2[i],arr3[i]);
            sum=sum+min-height[i];
        }
        return sum;

    }
}