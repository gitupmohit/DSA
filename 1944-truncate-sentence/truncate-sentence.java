class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder ss= new StringBuilder();
        int n = s.length();

        for(int i= 0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                k--;
            }
            if(k == 0){
                break;
            }
            ss.append(ch);
        }
        return ss.toString();
    }
}