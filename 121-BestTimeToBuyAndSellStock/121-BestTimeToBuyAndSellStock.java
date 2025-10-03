// Last updated: 04/10/2025, 01:44:59
class Solution {
public int maxProfit(int[] prices) {
int max = Integer.MIN_VALUE;
int min = Integer.MAX_VALUE;
for (int i = 0; i < prices.length; i++) {
if(prices[i] < min){
min = prices[i];
} 
max = Math.max(max, prices[i] - min);
}
return max;
}
}