class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = nums[n-1];
        int c = 1;
        for(int i =n-2; i >= 0; i--){
            if(nums[i] != ans){
                c++;
                if(c == 3){
                    return nums[i];
                }
                ans = nums[i];
            }
        }
        return nums[n-1];
    }
}