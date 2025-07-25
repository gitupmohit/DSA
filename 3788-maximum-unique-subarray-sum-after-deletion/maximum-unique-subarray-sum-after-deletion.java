class Solution {
    public int maxSum(int[] nums) {
        Arrays.sort(nums);
        // HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        int l = 0;
        for(int i=0; i<n; i++){
            if(nums[i] > 0){
                l = i;
                break;
            }else{
                l = i;
            }
        }

        for(int i=l; i<n; i++){
            // map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
            set.add(nums[i]);
        }
        int sum = 0;
        int m = set.size();
        for(int item : set){
            sum+=item;
        }
        return sum;
    }
}