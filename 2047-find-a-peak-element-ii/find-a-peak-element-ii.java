class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int max = 0;
        int n = mat.length;
        int m= mat[0].length;
        int r =0;
        int c= 0;

        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat[i][j] > max){
                    max = mat[i][j];
                    r =  i;
                    c = j;
                }
            }
        }
        return new int[] {r,c};
    }
}