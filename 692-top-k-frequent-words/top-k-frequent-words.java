class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        int n = words.length;

        for (int i = 0; i < n; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);

            if (freqA != freqB) {
                return freqB - freqA; // higher frequency first
            } else {
                return a.compareTo(b); // lex smaller string first
            }
        });

        for (String it : map.keySet()) {
            pq.offer(it);
        }

        for (int i = 0; i < k; i++) {
            list.add(pq.poll());
        }
        return list;
    }
}