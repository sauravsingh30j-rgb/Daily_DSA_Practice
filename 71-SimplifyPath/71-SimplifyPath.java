// Last updated: 04/10/2025, 01:45:42
class Solution {
    public String simplifyPath(String path) {
        List<String> list = new ArrayList<>();
        for (String s : path.split("/")) {
            if (s.equals("..")) {
                if (!list.isEmpty()) list.remove(list.size() - 1);
            } else if (!s.isEmpty() && !s.equals(".")) {
                list.add(s);
            }
        }
        return "/" + String.join("/", list);}}