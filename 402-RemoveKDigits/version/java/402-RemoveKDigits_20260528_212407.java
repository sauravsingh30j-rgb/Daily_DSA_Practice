// Last updated: 28/05/2026, 21:24:07
1class Solution {
2    public String removeKdigits(String num, int k) {
3        
4       int len=num.length();
5
6       if(k==len)
7       {
8        return "0";
9       }
10     
11     Stack<Character>stack = new Stack<>();
12
13     for(int i=0;i<len;i++)
14     {
15     while(k>0 &&!stack.isEmpty() && stack.peek()>num.charAt(i))
16     {
17        stack.pop();
18        k--;
19     }
20
21     stack.push(num.charAt(i));
22     
23
24    }
25
26  while(k>0)
27  {
28    stack.pop();
29    k--;
30  }
31
32
33
34  StringBuilder result = new StringBuilder();
35
36  while(!stack.isEmpty())
37  {
38      result.append(stack.pop());
39
40  }
41
42
43  result.reverse();
44
45
46  while(result.length()>1 && result.charAt(0)=='0')
47  {
48    result.deleteCharAt(0);
49  }
50
51  return result.toString();
52
53}
54}