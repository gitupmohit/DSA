class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }

    private static int atMostK(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int left = 0, result = 0;

        for (int right = 0; right < nums.length; right++) {
            freqMap.put(nums[right], freqMap.getOrDefault(nums[right], 0) + 1);

            if (freqMap.get(nums[right]) == 1) {
                k--; // new unique element
            }

            while (k < 0) {
                freqMap.put(nums[left], freqMap.get(nums[left]) - 1);
                if (freqMap.get(nums[left]) == 0) {
                    k++; // removed a unique element
                }
                left++;
            }

            result += right - left + 1; // count of subarrays ending at right
        }

        return result;
    }
}