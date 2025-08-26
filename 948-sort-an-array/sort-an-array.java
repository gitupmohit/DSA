class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int it : nums){
            pq.offer(it);
        }
        int s = pq.size();
        int[] arr = new int[s];
        
        for(int i = 0; i<s; i++){
            arr[i] = pq.poll();
        }
        return arr;
    }
}