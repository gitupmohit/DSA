class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] nums = new int[n];
        if(n==1) {
            nums[0] = -1;
            return nums;
        }
        

        for(int i=0; i<n-1; i++){
            int index = i+1;
            int max =0;
            while(index < n){
                max = Math.max(max,arr[index]);
                index++;
            }
            nums[i] = max;
        }
        nums[n-1] = -1;
        return nums;
    }
}