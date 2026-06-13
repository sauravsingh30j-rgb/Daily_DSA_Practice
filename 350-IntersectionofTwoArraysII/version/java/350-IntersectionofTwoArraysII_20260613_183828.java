// Last updated: 13/06/2026, 18:38:28
1class Solution {
2    public int[] intersect(int[]a, int[] b) {
3        
4        
5         ArrayList<Integer> p=new ArrayList<>();
6         ArrayList<Integer> q=new ArrayList<>();
7         ArrayList<Integer> r=new ArrayList<>();
8        for(int i=0;i<a.length;i++)
9        { 
10            p.add(a[i]);
11        }
12         for(int i=0;i<b.length;i++)
13        { 
14            q.add(b[i]);
15        }
16       for(int i=0;i<p.size();i++)
17       {
18        for(int j=0;j<q.size();j++)
19        {
20           if(p.get(i).equals(q.get(j)))
21            {
22                r.add(q.get(j));
23               
24                q.set(j,-1);
25                break;
26            }
27        }
28       }
29       int arr[]=new int[r.size()];
30       int i=0;
31       for(int l:r)
32       {
33        arr[i]=l;
34        i++;
35       }
36       return arr;
37    }
38}
39    
40