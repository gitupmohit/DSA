class Solution {
    public int mirrorDistance(int n) {
        int rev = 0;
        int val = n;

        while(val > 0){
            int last = val % 10;
            rev = rev*10 + last;
            val = val / 10;
        }
        return Math.abs(n - rev);
    }
}