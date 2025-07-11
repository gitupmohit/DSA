class Solution {
    public int maxMoves(int[][] grid) {
        int max = 0;
        int n = grid.length;
        int m = grid[0].length;
        int[][] memo = new int[n][m];

        for(int i= 0; i<n; i++){
                max = Math.max(max, dfs(grid,n,m,i,0,memo));
        }
        return max;
    }

    public int dfs(int[][] grid, int rows, int cols, int r, int c, int[][] memo){
        if(memo[r][c] != 0) return memo[r][c];
        int max =0;
        int[] drow = {-1,0,+1};
        int[] dcol = {+1,+1,+1};

        for(int i=0; i<3; i++){
            int nrow = r + drow[i];
            int ncol = c + dcol[i];

            if(nrow>= 0 && nrow<rows && ncol<cols && grid[nrow][ncol] > grid[r][c]){
                max = Math.max(max, 1+dfs(grid,rows,cols,nrow,ncol,memo));
            }
        }
        memo[r][c] = max;
        return memo[r][c];
    }
}