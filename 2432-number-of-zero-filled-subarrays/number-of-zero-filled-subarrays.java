class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n = nums.length;
        long c = 0;
        int z = 0;
        for(int i = 0; i<n; i++){
            if(nums[i] == 0){
                z++;
                c += z;
            }else{
                z = 0;
            }
        }
        return c;
        
    }
}