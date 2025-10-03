// Last updated: 04/10/2025, 01:46:10
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); 
        backtrack(candidates, target, 0);
        return result;
    }
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> a = new ArrayList<>();
    public void backtrack(int[] candidates, int target, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(a));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates at the same recursion level
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            if (candidates[i] > target) break; // Prune if the current number is too large

            a.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i + 1); 
            a.remove(a.size() - 1);
        }
    }
}
