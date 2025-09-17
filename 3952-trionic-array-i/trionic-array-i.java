class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int c = 0;
        boolean flag = true;
        for(int i=1; i<n; i++){
            if(nums[i] == nums[i-1]) return false;
            if(nums[i] > nums[i-1] && flag == true){
                continue;
            }else if(nums[i] < nums[i-1] && flag == false){
                continue;
            }else if(nums[i] > nums[i-1] && flag == false){
                c++;
                flag = true;
            }else if(nums[i] < nums[i-1] && flag == true){
                c++;
                flag = false;
            }
        }
        if(nums[1] <= nums[0]) return false;
        return c == 2;
    }
}