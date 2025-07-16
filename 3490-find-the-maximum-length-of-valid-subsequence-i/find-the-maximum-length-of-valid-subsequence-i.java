class Solution {
    public int maximumLength(int[] nums) {
        int n = nums.length;
        int el = 0;
        int ol = 0;
        int eol = 0;
        int oel = 0;
        boolean even = true;
        boolean odd = true;

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                el++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 != 0) {
                ol++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (even == true) {
                if (nums[i] % 2 == 0) {
                    eol++;
                    even = !even;
                }
            } else if (even == false) {
                if (nums[i] % 2 != 0) {
                    eol++;
                    even = !even;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (odd == true) {
                if (nums[i] % 2 != 0) {
                    oel++;
                    odd = !odd;
                }
            } else if (odd == false) {
                if (nums[i] % 2 == 0) {
                    oel++;
                    odd = !odd;
                }
            }
        }
        int max = el;

        if (ol > max) {
            max = ol;
        }
        if (eol > max) {
            max = eol;
        }
        if (oel > max) {
            max = oel;
        }

        return max;

    }
}