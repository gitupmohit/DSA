class Solution {
    public int minimumArea(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int minr = n;
        int maxr = 0;
        int maxc = 0;
        int minc = m;
        for(int i=0; i<n; i++){
            for(int j =0; j<m; j++){
                if(grid[i][j] == 1){
                    minr = Math.min(minr , i);
                    minc = Math.min(minc , j);
                    maxr = Math.max(maxr , i);
                    maxc = Math.max(maxc , j);
                }
            }
        }
       int row = (maxr - minr) + 1;
       int col = (maxc - minc) + 1;
       return row * col;
    }
}