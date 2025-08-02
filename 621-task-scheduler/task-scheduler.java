class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char task : tasks) {
            freq[task - 'A']++;
        }

        Arrays.sort(freq);
        int maxFreq = freq[25] - 1; // Last is the highest frequency
        int idleSlots = maxFreq * n;

        // Fill idle slots with other tasks
        for (int i = 24; i >= 0 && freq[i] > 0; i--) {
            idleSlots -= Math.min(freq[i], maxFreq);
        }

        return idleSlots > 0 ? tasks.length + idleSlots : tasks.length;
    }
}
