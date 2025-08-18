// Last updated: 18/08/2025, 23:30:16
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        String[] arr = new String[strs.length];
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray(); 
            Arrays.sort(chars);
            arr[i]= new String(chars);  
        }
        for(int i=0;i<strs.length;i++){
            List<String> curr=new ArrayList<>();
            char[] chars = strs[i].toCharArray(); 
            Arrays.sort(chars);
            String s= new String(chars);
            if(set.contains(s)) continue;
            set.add(s);
            for(int j=0;j<strs.length;j++){
                    if(s.equals(arr[j])){
                        curr.add(strs[j]);
                    }
            }
            res.add(curr);
        }

        return res;
    }
}