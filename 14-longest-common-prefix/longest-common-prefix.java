class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        StringBuilder s = new StringBuilder();
        int minLen = Integer.MAX_VALUE;

        // Find the length of the shortest string
        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }

        // Iterate character by character
        for (int i = 0; i < minLen; i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != ch) {
                    return s.toString(); // Return prefix found so far
                }
            }
            s.append(ch); // All strings have the same char at index i
        }

        return s.toString();
    }
}
