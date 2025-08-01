class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int count =0;
        // HashMap<Integer,Integer> map = new HashMap<>();
        int[] hash = new int[101];

        for(int i=0; i<n; i++){
            // map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
            // max = Math.max(max, map.get(nums[i]));
            hash[nums[i]]++;
        }

        for(int i=0; i<n; i++){
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