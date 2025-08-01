class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        int i = 0;

        while (i <= n) {
            int h = (i == n) ? 0 : heights[i];

            if (st.isEmpty() || h >= heights[st.peek()]) {
                st.push(i);
                i++;
            } else {
                int height = heights[st.pop()];
                int width = st.isEmpty() ? i : i - st.peek() - 1;
                int area = height * width;
                maxArea = Math.max(maxArea, area);
                // Note: We do not increment i here to reprocess current bar after pop
            }
        }

        return maxArea;
    }
}
