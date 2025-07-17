class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        int start = 1;
        int end = max;

        while(start <= end){
            int mid = start + (end - start) / 2;
            int val = calc(nums,n,mid);
            if(val <= threshold){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    public int calc(int[] nums, int n, int div){
        int ans = 0;

        for(int i=0; i<n; i++){
            ans+= Math.ceil((double)nums[i] / div);
        }
        return ans;
    }
}