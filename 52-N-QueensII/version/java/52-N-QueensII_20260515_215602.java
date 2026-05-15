// Last updated: 15/05/2026, 21:56:02
1class Solution {
2    public boolean isSafe(int board[][],int row,int col,int n){
3        int r = row;
4        int c = col;
5        while(r>=0 && c>=0){
6            if(board[r][c] == 1){
7                return false;
8            }
9            r--;
10            c--;
11        }
12        r = row;
13        c = col;
14        while(r<n && c>=0){
15            if(board[r][c] == 1){
16                return false;
17            }
18            r++;
19            c--;
20        }
21        r = row;
22        c = col;
23        while(c>=0){
24            if(board[r][c] == 1){
25                return false;
26            }
27            c--;
28        }
29        return true;
30    }
31    public int helper(int board[][],int col,int n){
32        if(col>= board.length){
33            return 1;
34        }
35        int count = 0;
36        for(int i=0;i<n;i++){
37            if(isSafe(board,i,col,n)){
38                board[i][col] = 1;
39                count += helper(board,col+1,n);
40                board[i][col] = 0;
41            }
42        }
43        return count;
44    }
45    public int totalNQueens(int n) {
46        int board[][] = new int[n][n];
47        return helper(board,0,n);
48    }
49}