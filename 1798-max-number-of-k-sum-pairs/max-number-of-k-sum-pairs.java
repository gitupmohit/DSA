class Solution {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length;
        int c = 0;
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int i=0; i<n; i++){
        //     int rem = k - nums[i];
        //     if(map.containsKey(rem)){
        //         map.put(rem , map.getOrDefault(rem , 0) -1);
        //         c++;
        //         if(map.get(rem) == 0){
        //             map.remove(rem);
        //         }
        //     }else{
        //         map.put(nums[i] , map.getOrDefault(nums[i] , 0) +1);
        //     }
            
        // }
        // return c;

        Arrays.sort(nums);
        int i=0; 
        int j = n-1;

        while(i < j){
            if(nums[i] + nums[j] == k){
                i++;
                j--;
                c++;
            }else if(nums[i] + nums[j] < k){
                i++;
            }else{
                j--;
            }
        }
        return c;
    }
}