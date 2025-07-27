class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int n = nums.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(prime(nums[i])){
                min = Math.min(i , min);
                max = Math.max(i , max);
            }
        }
        return max - min;
    }

    public boolean prime(int n){
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;

        for(int i=3; i*i<=n; i+=2){
            if(n % i == 0) return false;
        }
        return true;
    }
}