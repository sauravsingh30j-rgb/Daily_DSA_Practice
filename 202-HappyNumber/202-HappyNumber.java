// Last updated: 04/10/2025, 01:44:12
class Solution {
    public boolean isHappy(int n) {
        while (sum(n)>4)
        {
           n=sum(n);
        }
        if(sum(n)==1){
            return true;
        }else{
            return false;
        }
    }
    public static int sum(int num)
    {
        int sum = 0;
        while(num>0){
           int rem=num%10;
            sum=sum+rem*rem;
            num=num/10;
        }
        return sum;
    }
}




