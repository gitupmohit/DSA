class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int val = value(s.charAt(i));
            if (i + 1 < n && val < value(s.charAt(i + 1))) {
                ans -= val;
            } else {
                ans += val;
            }
        }
        return ans;
    }

    private int value(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
