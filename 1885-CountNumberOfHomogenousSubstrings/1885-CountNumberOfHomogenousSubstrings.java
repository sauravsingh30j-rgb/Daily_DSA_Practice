// Last updated: 04/10/2025, 01:41:58
class Solution {
    public int countHomogenous(String s) {
        int result=0;
        int count=0;
        int mod=1000000007;
        for(int i=0; i<s.length(); i++){
            if(i>0&&s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                count=1;
            }
            result=(result+count)%mod;
        }
        return result;
    }
}