class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        // Step 1: Sum of first k elements
        double sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        double maxSum = sum;

        // Step 2: Slide the window
        for(int i = k; i < n; i++){
            sum += nums[i] - nums[i-k];  // add new, remove old
            maxSum = Math.max(maxSum, sum);
        }

        // Step 3: Return max average
        return maxSum / k;
    }
}
