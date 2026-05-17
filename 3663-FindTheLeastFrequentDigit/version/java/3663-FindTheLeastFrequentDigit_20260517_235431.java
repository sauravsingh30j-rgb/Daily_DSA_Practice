// Last updated: 17/05/2026, 23:54:31
1class Solution {
2    public int getLeastFrequentDigit(int n) {
3        int max=0;
4
5        int temp=n;
6
7        while(temp>0){
8            int last=temp%10;
9            if(last>max){
10                max=last;
11            }
12            temp=temp/10;
13        }
14
15        int freq[]= new int[max+1];
16        
17        while(n>0){
18            int last=n%10;
19            freq[last]++;
20            n=n/10;
21        }
22
23        int least=Integer.MAX_VALUE;
24        int ans=-1;
25        for(int i=0;i<freq.length;i++){
26             
27           if(freq[i]>0 && freq[i]<least){
28            least=freq[i];
29            ans=i;
30           }
31        }
32        return ans;
33    }
34}