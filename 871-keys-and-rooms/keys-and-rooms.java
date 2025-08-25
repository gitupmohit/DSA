class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.offer(0);
        visited[0] = true;
        int c = 1;  // room 0 is already visited

        while (!q.isEmpty()) {
            int node = q.poll();
            for (int key : rooms.get(node)) {
                if (!visited[key]) {
                    visited[key] = true;
                    q.offer(key);
                    c++;
                }
            }
        }
        return c == n;
    }
}
