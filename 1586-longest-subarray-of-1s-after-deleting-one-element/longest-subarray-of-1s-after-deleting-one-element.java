class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int zeros = 0;
        int max = 0;
        int left = 0;

        for(int i=0; i<n; i++){
            if(nums[i] == 0) zeros++;
            while(zeros > 1){
                if(nums[left] == 0){
                    zeros--;
                }
                left++;
            }
            max = Math.max(max, i - left);
        }
        return max;
    }
}