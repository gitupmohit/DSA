class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        // Traverse 2n - 1 to simulate circular nature
        for (int i = 2 * n - 1; i >= 0; i--) {
            int index = i % n;

            // Maintain decreasing stack
            while (!st.isEmpty() && st.peek() <= nums[index]) {
                st.pop();
            }

            // Only set result in the first pass (i < n)
            if (i < n) {
                res[index] = st.isEmpty() ? -1 : st.peek();
            }

            st.push(nums[index]);
        }

        return res;
    }
}
