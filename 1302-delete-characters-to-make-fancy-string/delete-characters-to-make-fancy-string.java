class Solution {
    public String makeFancyString(String s) {
        StringBuilder str = new StringBuilder();

        for(char ch:s.toCharArray()){
            if(str.length() > 1){
                if(ch == str.charAt(str.length()-1) && ch == str.charAt(str.length()-2)){
                    continue;
                }
            }
            str.append(ch);
        }

        return str.toString();
    }
}