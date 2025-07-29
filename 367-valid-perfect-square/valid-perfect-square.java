class Solution {
    public boolean isPerfectSquare(int num) {
        // long n = num;
        // for(long i = 1; i*i <= n; i++){
        //     if(i*i == num) return true;
        // }
        // return false;
        int sqrt = (int) Math.sqrt(num);
        return sqrt*sqrt == num ? true:false;
    }
}