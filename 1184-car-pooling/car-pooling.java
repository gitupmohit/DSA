class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, (a, b) -> a[1] - b[1]);
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[] {0,0});
        for (int[] it : trips) {
            int n = list.size();
            int cap = 0;
            for(int i=0; i<n; i++){
                if(it[1] < list.get(i)[1]){
                    cap += list.get(i)[0];
                }
            }
            list.add(new int[] {it[0] , it[2]});
            cap += it[0];
            if(cap > capacity) return false;
        }
        return true;
    }
}