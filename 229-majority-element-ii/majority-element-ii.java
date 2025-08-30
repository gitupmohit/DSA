class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // int count1 = 0; int count2 =0;
        int n = nums.length;
        // int candidate1 =-1; int candidate2 =-1;
        ArrayList<Integer> result = new ArrayList<>();

        // for(int i=0; i<n; i++){
        //        if(nums[i]==candidate1){
        //         count1++;
        //        }else if(nums[i] == candidate2){
        //         count2++;
        //        }else if(count1 == 0){
        //         candidate1=nums[i];
        //         count1 = count1+1;
        //        }else if(count2 ==0){
        //         candidate2 = nums[i];
        //         count2 = count2+1;
        //        }else{
        //         count1--;
        //         count2--;
        //        }
        //     }
        //     count1=0;
        //     count2=0;

        //     for(int i = 0; i<n; i++){
        //         if(candidate1 == nums[i]){
        //             count1++;
        //         }else if(candidate2==nums[i]){
        //             count2++;
        //         }
        //     }

        //     if(count1>n/3) result.add(candidate1);
        //     if(count2>n/3) result.add(candidate2);

        //     return result;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int it : nums) {
            map.put(it, map.getOrDefault(it, 0) + 1);
        }
        for (int it : map.keySet()) {
            int val = map.get(it);
            if (val > n / 3) {
                result.add(it);
            }
        }
        return result;

    }
}
