// Last updated: 16/06/2026, 21:20:58
1class Solution {
2    public String[] findWords(String[] words) {
3
4        ArrayList<String> a = new ArrayList<>();
5
6        ArrayList<Character> row1 = new ArrayList<>(
7            Arrays.asList('q','w','e','r','t','y','u','i','o','p')
8        );
9
10        ArrayList<Character> row2 = new ArrayList<>(
11            Arrays.asList('a','s','d','f','g','h','j','k','l')
12        );
13
14        ArrayList<Character> row3 = new ArrayList<>(
15            Arrays.asList('z','x','c','v','b','n','m')
16        );
17
18        for (int i = 0; i < words.length; i++) {
19
20            String word = words[i].toLowerCase();
21            char ch = word.charAt(0);
22            boolean valid = true;
23
24            if (row1.contains(ch)) {
25                for (char c : word.toCharArray()) {
26                    if (!row1.contains(c)) {
27                        valid = false;
28                        break;
29                    }
30                }
31            } else if (row2.contains(ch)) {
32                for (char c : word.toCharArray()) {
33                    if (!row2.contains(c)) {
34                        valid = false;
35                        break;
36                    }
37                }
38            } else {
39                for (char c : word.toCharArray()) {
40                    if (!row3.contains(c)) {
41                        valid = false;
42                        break;
43                    }
44                }
45            }
46
47            if (valid) {
48                a.add(words[i]);
49            }
50        }
51
52        return a.toArray(new String[0]);
53    }
54}