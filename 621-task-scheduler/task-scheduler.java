// class Solution {
//     public int leastInterval(char[] tasks, int n) {
//         int[] freq = new int[26];
//         for (char task : tasks) {
//             freq[task - 'A']++;
//         }

//         Arrays.sort(freq);
//         int maxFreq = freq[25] - 1; // Last is the highest frequency
//         int idleSlots = maxFreq * n;

//         // Fill idle slots with other tasks
//         for (int i = 24; i >= 0 && freq[i] > 0; i--) {
//             idleSlots -= Math.min(freq[i], maxFreq);
//         }

//         return idleSlots > 0 ? tasks.length + idleSlots : tasks.length;
//     }
// }
class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : tasks)
        {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)-> b - a);
        maxHeap.addAll(map.values());

        int cycles = 0;
        while(!maxHeap.isEmpty())
        {
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i< n + 1; i++)
            {
                 if(!maxHeap.isEmpty())
                 {
                    temp.add(maxHeap.remove());
                 }
            }
            for(int i : temp)
            {
                if(--i > 0)
                {
                    maxHeap.add(i);
                }
            }
            cycles += maxHeap.isEmpty()? temp.size() : n + 1;
        }
        return cycles;
    }
}