class Solution {
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        int max = 0;
        Arrays.sort(nums);
        for(int i=0; i<n-2; i++){
            int f = nums[i];
            int s = nums[i+1];
            int t = nums[i+2];

            if(valid(f,s,t)){
                max = Math.max(0 , f+s+t);
            }
        }
        return max;
    }
    public boolean valid(int f, int s, int t){
        if((f + s) <= t) return false;
        if((f + t) <= s) return false;
        if((t + s) <= f) return false;

        return true;
    }
}