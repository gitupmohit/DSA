class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);  // optional but helps with duplicate handling

        for (int i = 0; i < n - 1; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int c = -nums[i] - nums[j];
                if (set.contains(c)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], c);
                    Collections.sort(triplet);
                    result.add(triplet);
                }
                set.add(nums[j]);
            }
        }

        return new ArrayList<>(result);
    }
}
