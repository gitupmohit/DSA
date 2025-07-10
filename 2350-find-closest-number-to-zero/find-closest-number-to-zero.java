class Solution {
    public int findClosestNumber(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int val = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int ans = Math.abs(nums[i] - 0);
           if(ans<min){
            min = ans;
            val = nums[i];
           }else if(ans == min){
            val = Math.max(val,nums[i]);
           }
        }
        return val;
    }
}