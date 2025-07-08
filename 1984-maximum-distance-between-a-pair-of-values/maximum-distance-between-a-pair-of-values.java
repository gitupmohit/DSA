class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        // ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;

        // for (int i = 0; i < n; i++) {
        //     for (int j = i; j < m; j++) {
        //         ArrayList<Integer> current = new ArrayList<>();
        //         if (nums1[i] <= nums2[j]) {
        //             current.add(i);
        //             current.add(j);
        //             list.add(current);
        //         }
        //     }
        // }
        // int max = 0;
        // for(int i=0; i<list.size(); i++){
        //     int first = list.get(i).get(0);
        //     int sec = list.get(i).get(1);
        //     max = Math.max(max, sec-first);
        // }
        // return max;
        int max = 0;
        int i =0;
        int j =0;

        while(i<n && j<m){
            if (nums1[i] <= nums2[j]) {
                max = Math.max(max, j-i);
                j++;
            }else{
                i++;
                if(i > j) j =i;
            }
        }
        return max;
    }
}