class Solution {
    public int removeDuplicates(int[] nums) {
        // // int n = nums.length;
        // // int i=1;
        // // for(int j=1;j<n;j++){
        // //     if(nums[j]!=nums[j-1]){
        // //         nums[i]=nums[j];
        // //         i++;
        // //     }
        // // }
        // // return i;

        int n = nums.length;
        int j=1;

        for(int i = 1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
       
        // int n= nums.length;
        // int j =0;
        // int prev = -102;
        // for(int i=0; i<n; i++){
        //     if(nums[i] != prev){
        //         nums[j] = nums[i];
        //         j++;
        //         prev = nums[i];
        //     }
        // }
        // return j;
    }
}