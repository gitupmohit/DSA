class Solution {
    public int mostWordsFound(String[] sentences) {
        int n = sentences.length;
        int max =0;

        for(int i=0; i<n; i++){
            String s = sentences[i];
            int size = s.length();
            int maxi =1;
            for(int j=0; j<size; j++){
                char ch = s.charAt(j);
                if(ch == ' '){
                    maxi++;
                }
            }
            max = Math.max(max,maxi);
        }
        return max;
    }
}