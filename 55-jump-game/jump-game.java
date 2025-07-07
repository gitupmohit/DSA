class Solution {
    public boolean canJump(int[] nums) {
        // int maxIndex = 0;
        // for(int i=0;i<nums.length;i++){
        //     if(i>maxIndex){
        //         return false;
        //     }
        // maxIndex = Math.max(maxIndex,i+nums[i]);
        // }
        // return true;

        int n = nums.length;
        int max =0;
        for(int i=0; i<n; i++){
            if(i> max){
                return false;
            }
            max = Math.max(max,nums[i] + i);
        }
        return true;
    }
}