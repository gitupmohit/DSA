class Solution {
    public String truncateSentence(String s, int k) {
        int count = 0;
        StringBuilder ss= new StringBuilder();
        int n = s.length();

        for(int i= 0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                count++;
            }
            if(count == k){
                break;
            }
            ss.append(ch);
        }
        return ss.toString();
    }
}