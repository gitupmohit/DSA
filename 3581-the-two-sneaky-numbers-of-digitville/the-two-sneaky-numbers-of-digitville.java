class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        int k =-1;
        int l =-1;
        // int[] arr = new int[2];
        // int index =0;
        // HashSet<Integer> set = new HashSet<>();

        // for(int i=0; i<n; i++){
        //     if(set.contains(nums[i])){
        //         arr[index] = nums[i];
        //         index++;
        //     }else{
        //         set.add(nums[i]);
        //     }
        // }
        // return arr;

        // Arrays.sort(nums);

        // for(int i=1; i<n; i++){
        //     if(nums[i] == nums[i-1]){
        //         arr[index] = nums[i];
        //         index++;
        //     }
        // }
        // return arr;

        int[] hash = new int[n];
        for(int i=0; i<n; i++){
            if(hash[nums[i]] == 1){
                if(k == -1){
                    k=nums[i];
                }else{
                    l =nums[i];
                }
            }
            hash[nums[i]]++;
        }
        return new int[] {k,l};
    }
}