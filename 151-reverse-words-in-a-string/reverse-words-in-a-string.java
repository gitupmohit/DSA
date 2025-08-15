class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        
        // Reverse the order of the words
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" "); // Add space between words
            }
        }
        
        return result.toString();
    }
}