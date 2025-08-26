class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max = 0;
        int area = 0;

        for(int[] it : dimensions){
            int row = it[0];
            int col = it[1];
            int a = row * col;
            double dig = Math.sqrt(row*row + col*col);
            if(dig > max){
                max = dig;
                area = a;
            }else if(dig == max && a > area){
                area = a;
            }
        }
        return area;
    }
}