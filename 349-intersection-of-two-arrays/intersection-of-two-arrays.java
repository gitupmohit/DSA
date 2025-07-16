class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                if (list.isEmpty() || nums1[i] != list.get(list.size() - 1)) {
                    list.add(nums1[i]);
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            }

        }

        int[] nums = new int[list.size()];
        i = 0;
        for (int k = 0; k < list.size(); k++) {
            nums[i] = list.get(k);
            i++;
        }
        return nums;
    }
}