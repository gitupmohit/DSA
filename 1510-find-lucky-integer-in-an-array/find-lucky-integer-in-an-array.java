class Solution {
    public int findLucky(int[] arr) {
        // Arrays.sort(arr);
        // int n = arr.length;
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int i = 0; i < n; i++) {
        //     map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        // }

        // for (int i = n-1; i >= 0; i--) {
        //     if (map.get(arr[i]) == arr[i]) {
        //         return arr[i];
        //     }
        // }
        // return -1;

         int[] freq = new int[501]; // Since 1 <= arr[i] <= 500

        // Count frequency of each number
        for (int num : arr) {
            freq[num]++;
        }

        // Check from largest to smallest
        for (int i = 500; i >= 1; i--) {
            if (freq[i] == i) {
                return i;
            }
        }

        return -1;
    }
}