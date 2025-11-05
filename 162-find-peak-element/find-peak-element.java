class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // Peak is in the left half including mid
                end = mid;
            } else {
                // Peak is in the right half
                start = mid + 1;
            }
        }

        // start == end is the index of a peak element
        return start;
    }
}