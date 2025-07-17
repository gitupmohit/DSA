class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(int ele:map.keySet()) {
            q.add(new int[]{ele,map.get(ele)});
            if(q.size()>k) {
                q.poll();
            } 
        }
        for(int i=0; i<k;i++){
            arr[i] = q.poll()[0];
        }
        return arr;
    }
}