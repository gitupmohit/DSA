class Solution {
    public int matrixScore(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        // Step 1: Flip rows where the first element is 0
        for (int i = 0; i < n; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < m; j++) {
                    grid[i][j] = 1 - grid[i][j]; // flip 0<->1
                }
            }
        }

        // Step 2: Flip columns where 1s are fewer than 0s
        for (int j = 0; j < m; j++) {
            int colCount = 0;
            for (int i = 0; i < n; i++) {
                if (grid[i][j] == 1) {
                    colCount++;
                }
            }
            if (colCount < n - colCount) {
                for (int i = 0; i < n; i++) {
                    grid[i][j] = 1 - grid[i][j]; // flip column
                }
            }
        }

        // Step 3: Calculate binary row values and sum
        int output = 0;
        for (int i = 0; i < n; i++) {
            int val = 0;
            for (int j = 0; j < m; j++) {
                val = (val << 1) | grid[i][j];
            }
            output += val;
        }

        return output;
    }
}
