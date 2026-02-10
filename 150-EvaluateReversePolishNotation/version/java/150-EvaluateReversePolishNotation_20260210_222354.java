// Last updated: 10/02/2026, 22:23:54
1class Solution {
2    public int evalRPN(String[] tokens) {
3        Stack<Integer> st = new Stack<>();
4
5        for (String token : tokens) {
6            if (isOperator(token)) {
7                int b = st.pop();
8                int a = st.pop();
9                int res = apply(a, b, token);
10                st.push(res);
11            } else {
12                st.push(Integer.parseInt(token));
13            }
14        }
15        return st.pop();
16    }
17
18    private boolean isOperator(String s) {
19        return s.equals("+") || s.equals("-") ||
20               s.equals("*") || s.equals("/");
21    }
22
23    private int apply(int a, int b, String op) {
24        switch (op) {
25            case "+": return a + b;
26            case "-": return a - b;
27            case "*": return a * b;
28            default: return a / b;
29        }
30    }
31}