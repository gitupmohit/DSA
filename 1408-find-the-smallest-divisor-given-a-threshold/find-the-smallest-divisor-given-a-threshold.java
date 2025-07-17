class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
        }

        int start = 1; 
        int end = max;

        while (start < end) {
            int mid = start + (end - start) / 2;
            int val = calc(nums, mid);
            if (val <= threshold) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public int calc(int[] nums, int div) {
        int ans = 0;
        for (int num : nums) {
            ans += (int)Math.ceil((double) num / div);
        }
        return ans;
    }
}
