// Last updated: 27/08/2025, 23:21:16
class Solution {
    public int[] transformArray(int[] nums) {
        int zero=0;
        int one=0;
        int []arr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
            {
                if(nums[i]%2==0)
                {
                    zero++;
                }
                if(nums[i]%2!=0)
                {
                    one++;
                }
            }
        System.out.println(zero);
          System.out.print(one);
        for(int i=0;i<zero;i++) { 
            
                arr[i]=0;
            }
        for(int j=zero;j<one+zero;j++)
             
            {
               arr[j]=1;
            }
        

        return arr;
        
        
    }
}