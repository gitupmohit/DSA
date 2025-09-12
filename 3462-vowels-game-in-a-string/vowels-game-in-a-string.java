class Solution {
    public boolean doesAliceWin(String s) {
        int c = 0;
        char[] ch = s.toCharArray();
        String ss = "aeiou";

        for(char cc : ch){
            if(ss.indexOf(cc) != -1){
                c++;
            }
        }
        return c!=0;
    }
}