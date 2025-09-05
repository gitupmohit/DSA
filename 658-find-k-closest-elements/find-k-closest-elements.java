class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) ->{
        if(a[0] != b[0]) return a[0] - b[0];
        else return a[1] - b[1];
        });
        for(int i =0; i<n; i++){
            int val = Math.abs(x - arr[i]);
            pq.offer(new int[] {val , arr[i]});
        }
        for(int i = 0; i<k; i++){
            int[] val = pq.poll();
            list.add(val[1]);
        }
        Collections.sort(list);
        return list;
    }
}