class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max =0;
        int left =0;
        int max2 =0;
        int n = nums.length;

        for(int i=0; i<n; i++){
            while(set.contains(nums[i]) && left < n){
                set.remove(nums[left]); 
                max2  = max2 - nums[left];
                left++;
            }
            set.add(nums[i]);
            max2+=nums[i];
            max = Math.max(max2,max);
        }
        return max;
    }
}