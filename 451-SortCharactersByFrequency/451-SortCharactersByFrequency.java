// Last updated: 04/10/2025, 01:42:48
class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) 
            map.put(c, map.getOrDefault(c, 0) + 1);

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        String res = "";
        for (var entry : list) 
            for (int i = 0; i < entry.getValue(); i++) 
                res += entry.getKey();
        
        return res;}}