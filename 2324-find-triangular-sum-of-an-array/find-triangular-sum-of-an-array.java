class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        Queue<Integer> q = new LinkedList<>();
        
        // Push all elements into queue
        for(int it : nums){
            q.offer(it);
        }

        // Perform n-1 reductions
        for(int i = 0; i < n - 1; i++){
            ArrayList<Integer> list = new ArrayList<>();
            int k = q.size();
            
            // Generate next level by summing adjacent elements
            for(int l = 0; l < k - 1; l++){
                int val = q.poll();
                int sum = val + q.peek();
                list.add(sum % 10);
            }

            // Clear the queue and insert new level
            q.clear();
            for(int num : list){
                q.offer(num);
            }
        }

        // Final result will be the only element left
        return q.peek();
    }
}
