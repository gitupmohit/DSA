class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, maxLength = 0, zeroCount = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeroCount++; // Count zeros in the window

            // If zeros exceed k, move left pointer to shrink the window
            while (zeroCount > k) {
                if (nums[left] == 0) zeroCount--;
                left++;
            }

            // Update maxLength with the valid window size
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
        
    }
}