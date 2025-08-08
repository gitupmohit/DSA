import java.util.*;

class Solution {
    public int reverseBits(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        // Step 1: Convert the number to a 32-bit binary (reversed order)
        for (int i = 0; i < 32; i++) {
            list.add(n % 2 == 0 ? 0 : 1);
            n = n / 2;
        }

        // Step 2: Build the reversed number from the list
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans += list.get(i) * Math.pow(2, 31 - i);
        }

        return ans;
    }
}
