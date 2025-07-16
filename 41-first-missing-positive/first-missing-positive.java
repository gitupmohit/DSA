class Solution {
    public int firstMissingPositive(int[] nums) {
        int n= nums.length;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            max = Math.max(max,nums[i]);
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(nums[i]);
        }

        for(int i= 1; i<max; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        if(max<0){
            return 1;
        }else return max+1;
    }
}