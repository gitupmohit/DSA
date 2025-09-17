class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
            return atMost(nums, goal) - atMost(nums, goal - 1);
        }

        private int atMost(int[] nums, int goal) {
            if (goal < 0) return 0; // Edge case: sum < 0 is invalid

            int left = 0, count = 0, sum = 0;

            for (int right = 0; right < nums.length; right++) {
                sum += nums[right];

                while (sum > goal) { // Shrink the window if sum exceeds goal
                    sum -= nums[left];
                    left++;
                }

                count += right - left + 1; // Count valid subarrays
            }

            return count;
        
    }
}