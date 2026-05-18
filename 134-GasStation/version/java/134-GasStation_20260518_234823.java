// Last updated: 18/05/2026, 23:48:23
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum1=0;
        for(int num:gas) sum1+=num;
        int sum2=0;
        for(int num:cost) sum2+=num;
        if(sum1<sum2) return -1;
        int curr=0;
        int start=0;
        for(int i=0; i<gas.length; i++){
            curr=curr+gas[i]-cost[i];
            if(curr<0){
                curr=0;
                start=i+1;
            }
        }
        return start;
    }
}