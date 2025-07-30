class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int prod = 0;
        boolean zero = false;
        int zeros = 0;

        for(int i=0; i<n; i++){
            if(prod == 0){
                prod = nums[i];
            }else if(nums[i] != 0){
                prod*=nums[i];
            }
            if(nums[i] == 0){
                zero = true;
                zeros++;
            }
        }
        for(int i=0; i<n; i++){
            if(zero){
                if(nums[i] != 0){
                    arr[i] = 0;
                }else{
                    arr[i] = prod;
                }
            }else{
                arr[i] = prod / nums[i];
            }
        }
        if(zeros > 1){
            Arrays.fill(arr,0);
        }
        return arr;

    }
}