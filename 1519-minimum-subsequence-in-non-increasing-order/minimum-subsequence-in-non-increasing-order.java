class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int sum = 0;
        int n = nums.length;

        for(int i=0; i<n; i++){
            sum = sum+nums[i];
        }

        int sum2 =0;
        for(int i = n-1; i>= 0; i--){
            sum2 += nums[i];
            list.add(nums[i]);
            if(sum2 > sum/2){
                break;
            }
        }
        return list;

    }
}