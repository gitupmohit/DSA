import java.util.*;

class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = events.length;
        int day = 0, i = 0, count = 0;
        
        while (!pq.isEmpty() || i < n) {
            if (pq.isEmpty()) {
                day = events[i][0];
            }
            // Add all events starting today
            while (i < n && events[i][0] == day) {
                pq.offer(events[i][1]);
                i++;
            }
            // Remove expired events
            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }
            if (!pq.isEmpty()) {
                pq.poll(); // attend the event ending earliest
                count++;
            }
            day++;
        }
        return count;
    }
}
