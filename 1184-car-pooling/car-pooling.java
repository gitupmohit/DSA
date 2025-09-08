// class Solution {
//     public boolean carPooling(int[][] trips, int capacity) {
//         Arrays.sort(trips, (a, b) -> a[1] - b[1]);
//         ArrayList<int[]> list = new ArrayList<>();
//         list.add(new int[] {0,0});
//         for (int[] it : trips) {
//             int n = list.size();
//             int cap = 0;
//             for(int i=0; i<n; i++){
//                 if(it[1] < list.get(i)[1]){
//                     cap += list.get(i)[0];
//                 }
//             }
//             list.add(new int[] {it[0] , it[2]});
//             cap += it[0];
//             if(cap > capacity) return false;
//         }
//         return true;
//     }
// }

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        // Sort trips by start location
        Arrays.sort(trips, (a, b) -> a[1] - b[1]);

        // Min-heap to track ongoing trips [dropLocation, numPassengers]
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        int passengers = 0;

        for (int[] trip : trips) {
            int num = trip[0];
            int from = trip[1];
            int to = trip[2];

            // Drop off passengers whose destination ≤ current pickup
            while (!pq.isEmpty() && pq.peek()[0] <= from) {
                passengers -= pq.poll()[1];
            }

            // Pick up current trip passengers
            passengers += num;
            if (passengers > capacity) return false;

            // Add this trip to heap
            pq.offer(new int[]{to, num});
        }

        return true;
    }
}
