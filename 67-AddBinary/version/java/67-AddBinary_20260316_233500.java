// Last updated: 16/03/2026, 23:35:00
1class Solution {
2    public String addBinary(String a, String b) {
3      StringBuilder res = new StringBuilder();
4
5      int i = a.length()-1;
6      int j = b.length()-1;
7      int carry = 0;
8
9      while(i>=0 || j >= 0 || carry == 1){
10
11        int sum = carry;
12        
13        if(i>= 0){
14            sum += a.charAt(i) - '0';
15            i--;
16        }
17
18        if(j>= 0){
19            sum  += b.charAt(j) - '0';
20            j--;
21        }
22
23
24        res.append(sum%2);
25        carry = sum/2;
26      }
27
28    return res.reverse().toString();
29    }
30}