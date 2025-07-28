class Solution {
    public boolean canMakeSquare(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        for(int i=0; i<n-1; i++){
            for(int j =0; j<m-1; j++){
                int b = 0;
                if(grid[i][j] == 'B'){
                    b++;
                }
                if(grid[i+1][j] == 'B'){
                    b++;
                }
                if(grid[i][j+1] == 'B'){
                    b++;
                }
                if(grid[i+1][j+1] == 'B'){
                    b++;
                }
                if(b>=3 || b<=1){
                    return true;
                }
            }
        }
        return false;
    }
}