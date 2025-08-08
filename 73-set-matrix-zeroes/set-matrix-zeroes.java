class pair{
    int r;
    int c; 

    pair(int r, int c){
        this.r = r;
        this.c = c;
    }
}

class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[] rowZero = new boolean[rows];
        boolean[] colZero = new boolean[cols];

        // Step 1: Identify rows and columns that need to be set to zero
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }

        // Step 2: Set rows to zero
        for (int i = 0; i < rows; i++) {
            if (rowZero[i]) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Set columns to zero
        for (int j = 0; j < cols; j++) {
            if (colZero[j]) {
                for (int i = 0; i < rows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // int row = matrix.length;
        // int col = matrix[0].length;

        // Queue<pair> q = new LinkedList<>();

        // for(int i=0; i<row; i++){
        //     for(int j=0; j<col; j++){
        //         if(matrix[i][j]==0){
        //             q.offer(new pair(i,j));
        //         }
        //     }
        // }

        // int[] drow = {1,0,-1,0};
        // int[] dcol = {0,-1,0,1};

        // while(!q.isEmpty()){
        //     int rows = q.peek().r;
        //     int cols = q.peek().c;
        //     q.poll();

        //     for(int i=0; i<4; i++){
        //         int nrow = rows + drow[i];
        //         int ncol = cols + dcol[i];

        //         if(nrow>=0 && ncol>=0 && nrow<row && ncol<col){
        //             matrix[nrow][ncol] = 0;
        //         }
        //     }
        // }
     
}
}