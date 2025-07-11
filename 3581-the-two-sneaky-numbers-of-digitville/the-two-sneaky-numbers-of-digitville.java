class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2];
        int index =0;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++){
            if(set.contains(nums[i])){
                arr[index] = nums[i];
                index++;
            }else{
                set.add(nums[i]);
            }
        }
        return arr;
    }
}