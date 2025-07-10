class Solution {
    public int findClosestNumber(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int val = Integer.MIN_VALUE;
        Arrays.sort(nums);

        for(int i=0; i<n; i++){
            int ans = Math.abs(nums[i] - 0);
           if(ans<=min){
            min = ans;
            val = Math.max(val,nums[i]);
           }
        }
        return val;
    }
}