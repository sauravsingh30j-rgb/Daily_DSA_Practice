// Last updated: 10/09/2025, 16:59:10
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