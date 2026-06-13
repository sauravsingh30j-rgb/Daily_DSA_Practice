// Last updated: 13/06/2026, 15:20:16
1class Solution {
2    public int maxProfit(int[] prices) {
3        int profit=0;
4        int min=prices[0];
5        int max=0;
6        for(int i=0;i<prices.length;i++)
7        {
8         if(prices[i]<min)
9          {
10            min=prices[i];
11          }
12            profit=prices[i]-min;
13            max=Math.max(max,profit);
14
15        }
16        return max;
17    }
18}