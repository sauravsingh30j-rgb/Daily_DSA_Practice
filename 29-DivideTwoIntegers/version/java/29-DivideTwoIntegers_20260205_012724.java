// Last updated: 05/02/2026, 01:27:24
class Solution {
    public int divide(int dividend, int divisor) {
      long res;
      res = dividend/divisor;
      if(dividend==-2147483648 && divisor==-1){
        return 2147483647;
      }
      return (int)res;   
    }
}