class Solution {
    public int countHillValley(int[] nums) {
        // int count =0;
        // int n = nums.length;

        // for(int i=1; i<n-1; i++){
        //     int left = -1;
        //     int right = -1;
        //     for(int j= 0; j<n; j++){
        //         if(j<i && nums[j] != nums[i]){
        //             left = nums[j];
        //         }else if(j>i && nums[j] != nums[i]){
        //             right = nums[j];
        //             break;
        //         }
        //     }
        //     if(nums[i] == nums[i-1]){
        //         continue;
        //     }else if(left == -1 || right == -1){
        //         continue;
        //     }else if(nums[i] > left && nums[i] > right){
        //         count++;
        //     }else if(nums[i] < left && nums[i] <right){
        //         count++;
        //     }
        // }
        // return count;
        int res=0;
        int fval=nums[0];
        for(int i=1; i<nums.length-1; i++){
            if(fval < nums[i] && nums[i] > nums[i+1] || fval > nums[i] && nums[i] < nums[i+1]){
                fval=nums[i];
                res++;
            }
        }
        return res;
    }
}