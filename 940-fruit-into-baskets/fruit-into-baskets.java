class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = fruits.length;
        int left = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            map.put(fruits[i], map.getOrDefault(fruits[i], 0) + 1);

            while (map.size() > 2) {
                int fruit = fruits[left];
                int count = map.get(fruit);
                if (count == 1) {
                    map.remove(fruit);
                } else {
                    map.put(fruit, count - 1);
                }
                left++;
            }

            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
