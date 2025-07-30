class Solution {
    public int mostFrequentEven(int[] nums) {
        int[] hash = new int[100001];
        int maxFreq = 0;
        int result = -1;

        for (int num : nums) {
            if (num % 2 == 0) {
                hash[num]++;
                if (hash[num] > maxFreq || (hash[num] == maxFreq && num < result)) {
                    maxFreq = hash[num];
                    result = num;
                }
            }
        }

        return result;
    }
}
