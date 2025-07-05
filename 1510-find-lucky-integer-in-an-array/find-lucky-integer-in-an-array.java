class Solution {
    public int findLucky(int[] arr) {
        int ans = -1;
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = n-1; i >= 0; i--) {
            if (map.get(arr[i]) == arr[i]) {
                ans = Math.max(ans, arr[i]);
            }
        }
        return ans;
    }
}