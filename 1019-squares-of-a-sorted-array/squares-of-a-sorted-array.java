class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] num = new int[n];
        int left = 0;
        int right = n-1;

        for(int i=right; i>=0; i--){
            int square;
            if(Math.abs(nums[left]) < Math.abs(nums[right])){
                square = nums[right] * nums[right];
                right--;
            }else{
                square = nums[left] * nums[left];
                left++;
            }
            num[i] = square;
        }
        return num;
    }
}