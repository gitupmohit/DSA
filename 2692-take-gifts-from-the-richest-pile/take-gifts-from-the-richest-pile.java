class Solution {
    public long pickGifts(int[] gifts, int k) {
        int n = gifts.length;

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> Integer.compare(b,a));
        for(int i=0; i<n; i++){
            pq.offer(gifts[i]);
        }
        for(int i=0; i<k; i++){
            int val = pq.poll();
            val = (int)Math.floor(Math.sqrt(val));
            pq.offer(val);
        }
        int size = pq.size();
        long sum =0;
        for(int i=0; i<size; i++){
            sum = sum + pq.poll();
        }
        return sum;
    }
}