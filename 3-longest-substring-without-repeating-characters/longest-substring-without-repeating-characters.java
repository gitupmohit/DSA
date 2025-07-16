class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Set<Character> set = new HashSet<>();
        // int left = 0, maxLength = 0;

        // for (int right = 0; right < s.length(); right++) {
        //     while (set.contains(s.charAt(right))) {
        //         set.remove(s.charAt(left));
        //         left++; // Shrink window from the left
        //     }
        //     set.add(s.charAt(right));
        //     maxLength = Math.max(maxLength, right - left + 1);
        // }
        // return maxLength;

        int n = s.length();
        Set<Character> set = new HashSet<>();
        int left=0;
        int max=0;
        
        for(int right=0; right<n; right++){

            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            max= Math.max(max,right-left +1);
        }
        return max;
    }
}