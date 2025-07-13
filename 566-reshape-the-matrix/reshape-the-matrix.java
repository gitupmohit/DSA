class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        int reshape[][]=new int[r][c];
        if(m*n==r*c){
             for(int i=0;i<m*n;i++){
                 reshape[i / c][i % c] = mat[i / n][i % n];
                 //(i/c)==Rows of Reshape Array && (i%c)==cols of the reshape array....Reshape
                 //(i/n)==Rows of ORG Array && (i%n)==cols of the ORG array....Mat
            }
        } else{
           reshape=mat; 
        }
        return reshape;
   
        
    }
}