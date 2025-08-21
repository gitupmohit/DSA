import java.util.*;

class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int n = costs.length;
        long sum = 0;

        // Two min-heaps: left and right candidates
        PriorityQueue<Integer> leftPQ = new PriorityQueue<>();
        PriorityQueue<Integer> rightPQ = new PriorityQueue<>();

        int i = 0, j = n - 1;

        // Fill initial candidates from both ends
        for (; i < candidates && i <= j; i++) {
            leftPQ.offer(costs[i]);
        }
        for (; j >= n - candidates && j >= i; j--) {
            rightPQ.offer(costs[j]);
        }

        // Hire k workers
        for (int hired = 0; hired < k; hired++) {
            int leftVal = leftPQ.isEmpty() ? Integer.MAX_VALUE : leftPQ.peek();
            int rightVal = rightPQ.isEmpty() ? Integer.MAX_VALUE : rightPQ.peek();

            if (leftVal <= rightVal) {
                sum += leftPQ.poll();
                if (i <= j) { // expand left side
                    leftPQ.offer(costs[i++]);
                }
            } else {
                sum += rightPQ.poll();
                if (i <= j) { // expand right side
                    rightPQ.offer(costs[j--]);
                }
            }
        }

        return sum;
    }
}
