class Solution {
    public String truncateSentence(String s, int k) {
        int count = 0;
        String ss= "";
        int n = s.length();

        for(int i= 0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                count++;
            }
            if(count == k){
                break;
            }
            ss+=ch;
        }
        return ss;
    }
}