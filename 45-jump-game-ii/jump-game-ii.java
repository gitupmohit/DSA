class Solution {
    public int jump(int[] nums) {
        // if (nums.length <= 1) return 0; // No jump needed if already at the last index

        // int jumps = 0, maxReach = 0, currentEnd = 0;

        // for (int i = 0; i < nums.length; i++) {
        //     maxReach = Math.max(maxReach, i + nums[i]); // Farthest we can go from index i

        //     if (i == currentEnd) { // Time to jump
        //         jumps++;
        //         currentEnd = maxReach; // Update jump range
                
        //         if (currentEnd >= nums.length - 1) break; // Already reached the last index
        //     }
        // }

        // return jumps; 

        int n = nums.length;
        if(n==1) return 0;
        int max = 0;
        int curr =0;
        int maxr =0;
        

        for(int i=0; i<n; i++){
            maxr = Math.max(maxr, i + nums[i]);
            if(nums[i] + i >= n-1){
                max++;
                break;
            }else if(i == curr){
                max++;
                curr = maxr;
            }
        }
        return max;
    }
}