// Last updated: 28/10/2025, 22:49:10

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        int[] queens = new int[n];
        backtrack(result, queens, 0);
        return result;
    }

    private void backtrack(List<List<String>> result, int[] queens, int row) {
        if (row == queens.length) {
            List<String> solution = new ArrayList<>();
            for (int i = 0; i < queens.length; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < queens.length; j++) {
                    sb.append(j == queens[i] ? 'Q' : '.');
                }
                solution.add(sb.toString());
            }
            result.add(solution);
            return;
        }
        for (int col = 0; col < queens.length; col++) {
            if (isValid(queens, row, col)) {
                queens[row] = col;
                backtrack(result, queens, row + 1);
            }
        }
    }
    private boolean isValid(int[] queens, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || Math.abs(queens[i] - col) == row - i) {
                return false;
            }
        }
        return true;}}