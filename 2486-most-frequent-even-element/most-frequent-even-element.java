class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length;
        int[] hash = new int[100000];
        for(int i=0; i<n; i++){
            if(nums[i] % 2 == 0){
                hash[nums[i]]++;
            }
        }
        int count = 0;
        int val = -1;
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            if(hash[nums[i]] > count){
                count = hash[nums[i]];
                val = nums[i];
            }
        }
        return val;
    }
}