class Solution {
    public int[] productQueries(int n, int[][] queries) {
        ArrayList<Integer> list = new ArrayList<>();
        int temp = n;
        int pow = 0;

        // Extract powers of two from n's binary representation
        while (temp > 0) {
            if (temp % 2 == 1) {
                list.add((int) Math.pow(2, pow));
            }
            pow++;
            temp /= 2;
        }

        int m = queries.length;
        int[] arr = new int[m];
        int MOD = 1_000_000_007;

        // Answer queries
        for (int qi = 0; qi < m; qi++) {
            int start = queries[qi][0];
            int end = queries[qi][1];
            long ans = 1;
            for (int i = start; i <= end; i++) {
                ans = (ans * list.get(i)) % MOD;
            }
            arr[qi] = (int) ans;
        }
        return arr;
    }
}
