// Last updated: 31/12/2025, 23:41:52
1class Solution {
2    public String[] findRestaurant(String[] list1, String[] list2) {
3        Map<String, Integer> map = new HashMap<>();
4        List<String> res = new ArrayList<>();
5        int minValue = Integer.MAX_VALUE;
6
7        for(int i = 0; i < list1.length; i++){
8            map.put(list1[i], i);
9        }
10
11        for(int j = 0; j < list2.length; j++){
12            String s = list2[j];
13            if(map.containsKey(s)){
14                int indexSum = j + map.get(s);
15                if(indexSum < minValue){
16                    res.clear();
17                    res.add(s);
18                    minValue = indexSum;
19                } else if (indexSum == minValue){
20                    res.add(s);
21                }
22            }
23        }
24        return res.toArray(new String[0]);
25    }
26}