class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n= weights.length;
        int sum = 0;
        int max = 0;
        for(int i=0; i<n; i++){
            sum+= weights[i];
            max = Math.max(max,weights[i]);
        }
        int start = max;
        int end = sum;

        while(start <= end){
            int mid = start + (end - start) / 2;
            int val = calc(weights, n, mid);
            if(val <= days){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    public int calc(int[] weights, int n, int mid) {
    int day = 1; 
    int sum = 0;
    for (int i = 0; i < n; i++) {
        if (sum + weights[i] > mid) {
            day++;
            sum = 0;
        }
        sum += weights[i];
    }
    return day;
    }
}