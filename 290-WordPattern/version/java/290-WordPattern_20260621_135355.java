// Last updated: 21/06/2026, 13:53:55
1class Solution {
2    public boolean wordPattern(String p, String s) {
3        String[] arr = s.split(" ");
4
5        if (arr.length != p.length()) return false;
6
7        for (int i = 0; i < p.length(); i++) {
8            for (int j = i + 1; j < p.length(); j++) {
9
10                if (p.charAt(i) == p.charAt(j)
11                        && !arr[i].equals(arr[j])) {
12                    return false;
13                }
14
15                if (p.charAt(i) != p.charAt(j)
16                        && arr[i].equals(arr[j])) {
17                    return false;
18                }
19            }
20        }
21
22        return true;
23    }
24}