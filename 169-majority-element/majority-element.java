class Solution {
    public int majorityElement(int[] nums) {
    //     int count = 0; // Counter for occurrences
    //     int candidate = 0; // Candidate for majority element

    //     // Step 1: Find a potential candidate
    //     for (int i = 0; i < nums.length; i++) {
    //         if (count == 0) {
    //             candidate = nums[i];
    //         }
    //         if (nums[i] == candidate) {
    //             count++;
    //         } else {
    //             count--;
    //         }
    //     }

    //     // Step 2: Verify if the candidate is indeed the majority element
    //     count = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i] == candidate) {
    //             count++;
    //         }
    //     }

    //     if (count > nums.length / 2) {
    //         return candidate;
    //     } else {
    //         throw new IllegalArgumentException("No majority element found");
    // }

    // int hash[] = new int[5*100000];
    // int n = nums.length;
    // int ans =-1;

    // for(int i =0; i<n; i++){
    //     hash[nums[i]]++;
    // }

    // for(int j=0; j<hash.length; j++){
    //     if(hash[j] > n/2){
    //         ans = j;
    //     }
    // }

    // System.out.println(Arrays.toString(hash));

    // return ans;

    int count = 0;
    int n = nums.length;
    int candidate =0;

    for(int i=0; i<n; i++){
            if (count == 0) {
                candidate = nums[i];
            }
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
}
}
