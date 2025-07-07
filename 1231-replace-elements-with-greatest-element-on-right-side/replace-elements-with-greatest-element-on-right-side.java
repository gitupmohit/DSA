class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] nums = new int[n];
        int max = -1;
        

        for(int i=n-1; i>=0; i--){
            nums[i] = max;
            max = Math.max(max, arr[i]);
        }
        
        return nums;
    }
}