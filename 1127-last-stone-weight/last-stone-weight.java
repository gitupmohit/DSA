class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> b - a
        );

        for(int it : stones){
            pq.offer(it);
        }
        while(pq.size() > 1){
            int val1 = pq.poll();
            int val2 = pq.poll();
            int ans = Math.abs(val1 - val2);
            if(ans > 0){
                pq.offer(ans);
            }
        }
        if(!pq.isEmpty()){
            return pq.peek();
        }
        return 0;
    }
}