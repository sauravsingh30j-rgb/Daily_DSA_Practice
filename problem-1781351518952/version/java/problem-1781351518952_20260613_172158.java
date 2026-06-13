// Last updated: 13/06/2026, 17:21:58
1class Solution {
2    public int[] intersection(int[] a, int[] b) {
3        
4        HashSet<Integer> p=new HashSet<>();
5        HashSet<Integer> r=new HashSet<>();
6        for(int i:a)
7        { 
8            p.add(i);
9        }
10         for(int j:b)
11        { 
12           if(p.contains(j))
13           {
14            r.add(j);
15           }
16        }
17      
18       int arr[]=new int[r.size()];
19       int i=0;
20       for(int l:r)
21       {
22        arr[i]=l;
23        i++;
24       }
25       return arr;
26    }
27}