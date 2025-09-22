class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int count =0;
        int[] hash = new int[101];

        for(int i=0; i<n; i++){
            hash[nums[i]]++;
            int val = hash[nums[i]];
            max = Math.max(max,val);
        }

        for(int i=0; i<n; i++){
            int val = hash[nums[i]];
            if(val == max){
                count++;
            }
        }
        return count;
    }
}