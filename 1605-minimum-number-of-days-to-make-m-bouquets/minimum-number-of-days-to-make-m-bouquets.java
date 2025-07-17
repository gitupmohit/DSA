class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(n < m*k) return -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            min = Math.min(min,bloomDay[i]);
            max = Math.max(max,bloomDay[i]);
        }

        int start = min;
        int end = max;

        while(start<=end){
            int mid = start + (end - start) / 2;
            int num = calc(bloomDay,k,mid);
            if(num >= m){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return calc(bloomDay, k, start) >= m ? start : -1;

    }
    public int calc(int[] bloomDay, int k, int day) {
        int flowers = 0, bouquets = 0;
        for (int bloom : bloomDay) {
            if (bloom <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }
        return bouquets;
    }
}