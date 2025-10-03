// Last updated: 04/10/2025, 01:46:32
import java.util.*;
class Solution {
    public List<String> generateParenthesis(int n) {
		List<String> ll = new ArrayList<>();
		Parentheses(n, 0, 0, "",ll);
return 	ll;}
	public static void Parentheses(int n, int closed, int open, String ans,List<String> ll) {
		if (open == n && closed == n) {
			//System.out.println(ans);
			ll.add(ans);
			return;
		}
		if (open > n || closed > open) {
			return;
		}
		Parentheses(n, closed, open + 1, ans + "(",ll);
		Parentheses(n, closed + 1, open, ans + ")",ll);
	}
}
    