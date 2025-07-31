class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>(); // store indices

        for (int i = n - 1; i >= 0; i--) {
            // Pop indices with temperatures less than or equal to current
            while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }

            // If stack is not empty, top is the next warmer day
            if (!stack.isEmpty()) {
                res[i] = stack.peek() - i;
            }

            // Push current day index
            stack.push(i);
        }

        return res;
    }
}
