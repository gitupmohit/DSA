class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;


        int x = 0;
        for(int i=0; i<nums1.length; i++){
            min1 = Math.min(nums1[i] , min1);
            min2 = Math.min(nums2[i] , min2);
        }
        return min2 - min1;
    }
}