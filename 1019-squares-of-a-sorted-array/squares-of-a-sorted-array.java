class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] num = new int[n];
        int j = 0;

        for(int i=0; i<n; i++){
            num[j] = nums[i] * nums[i];
            j++;
        }
        Arrays.sort(num);
        return num;
    }
}