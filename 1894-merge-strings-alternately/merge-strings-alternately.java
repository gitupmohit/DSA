class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();
        int n = word1.length();
        int m = word2.length();
        int i = 0;
        int j = 0;
        boolean flip = true;

        while(i<n && j<m){
           if(flip){
             s.append(word1.charAt(i));
             i++;
             flip = !flip;
           }else{
            s.append(word2.charAt(j));
            j++;
            flip = !flip;
           }
        }
        while(i < n){
            s.append(word1.charAt(i));
             i++;
        }
        while(j < m){
            s.append(word2.charAt(j));
            j++;
        }
        return s.toString();
    }
}