class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
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