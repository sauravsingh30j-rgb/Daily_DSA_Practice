// Last updated: 01/01/2026, 22:47:46
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        List<List<String>> res = new ArrayList<>();
4        HashSet<String> set = new HashSet<>();
5        String[] arr = new String[strs.length];
6        for (int i = 0; i < strs.length; i++) {
7            char[] chars = strs[i].toCharArray(); 
8            Arrays.sort(chars);
9            arr[i]= new String(chars);  
10        }
11        for(int i=0;i<strs.length;i++){
12            List<String> curr=new ArrayList<>();
13            char[] chars = strs[i].toCharArray(); 
14            Arrays.sort(chars);
15            String s= new String(chars);
16            if(set.contains(s)) continue;
17            set.add(s);
18            for(int j=0;j<strs.length;j++){
19                    if(s.equals(arr[j])){
20                        curr.add(strs[j]);
21                    }
22            }
23            res.add(curr);
24        }
25
26        return res;
27    }
28}