class Solution {
    public String makeFancyString(String s) {
        StringBuilder str = new StringBuilder();
        char last = '0';
        int cnt = 0;

        for(char ch:s.toCharArray()){
            if(last == ch){
                cnt++;
                if(cnt > 2){
                    continue;
                }
            }
            else{
                last = ch;
                cnt = 1;
            }
            str.append(ch);
        }

        return str.toString();
    }
}