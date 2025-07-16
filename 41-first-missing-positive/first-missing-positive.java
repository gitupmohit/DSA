class Solution {
    public int firstMissingPositive(int[] nums) {
        int n= nums.length;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            max = Math.max(max,nums[i]);
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(nums[i] , 1);
        }

        for(int i= 1; i<max; i++){
            if(!map.containsKey(i)){
                return i;
            }
        }
        if(max<0){
            return 1;
        }else return max+1;
    }
}