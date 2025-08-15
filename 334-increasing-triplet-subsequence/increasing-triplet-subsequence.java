class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int[] min = new int[n];
        int[] max = new int[n];
        max[n-1] = nums[n-1];
        min[0] = nums[0];
        for(int i=1; i<n; i++){
            if(nums[i] < min[i-1]){
                min[i] = nums[i];
            }else{
                min[i] = min[i-1];
            }
        }
        for(int i=n-2; i>=0; i--){
            if(nums[i] > max[i+1]){
                max[i] = nums[i];
            }else{
                max[i] = max[i+1];
            }
        }
        for(int i=1; i<n-1; i++){
            if(min[i-1] < nums[i] && nums[i] < max[i+1]){
                return true;
            }
        }

        return false;
    }
}