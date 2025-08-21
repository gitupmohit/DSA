class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n= nums.length;
        Arrays.sort(nums);

        return nums[n-k];

    // PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // max-heap

    // for (int num : nums) {
    //     minHeap.offer(num);
    //     if (minHeap.size() > k) {
    //         minHeap.poll(); // remove smallest
    //     }
    // }

    // return minHeap.peek();
    }
}