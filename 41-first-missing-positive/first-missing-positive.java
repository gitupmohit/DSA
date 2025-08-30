class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            min = Math.min(min , nums[i]);
            max = Math.max(max , nums[i]);
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) +1);
        }
        for(int i = 1; i <= Integer.MAX_VALUE; i++){
            if(!map.containsKey(i)){
                return i;
            }
        }
        return 0;
    }
}