class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (i < n && j < m) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                list.add(nums2[j]);  // fixed index here
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                list.add(nums1[i]);
                i++;
            } else {
                list.add(nums2[j]);
                j++;
            }
        }
        while (i < n) {
            list.add(nums1[i]);
            i++;
        }
        while (j < m) {
            list.add(nums2[j]);
            j++;
        }

        int k = list.size();
        if (k % 2 == 0) {
            int kk = k / 2;
            return ((double)(list.get(kk - 1) + list.get(kk)) / 2);
        } else {
            return (double)(list.get(k / 2));
        }
    }
}
