// Last updated: 04/10/2025, 01:42:56
class Solution {
    ArrayList<Integer> a = new ArrayList<>();
    public List<Integer> lexicalOrder(int n) {
        print(n, 0, a);
        a.remove(0);
        return a;
    }
    public static void print(int n, int curr, List<Integer> a) {
        if (curr > n) {
            return;
        }
        a.add(curr);
        int i = (curr == 0) ? 1 : 0;
        for (; i <= 9; i++) {
            int next = curr * 10 + i;
            
            print(n, next, a);
        }
    }
}
