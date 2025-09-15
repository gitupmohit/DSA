class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] s = text.split(" ");
        int n = s.length;
        int c = 0;

        for(String it : s){
            int size = it.length();
            for(int i=0; i<size; i++){
                char ch = it.charAt(i);
                if(brokenLetters.indexOf(ch) != -1){
                    c++;
                    break;
                }
            }
        }
        return n - c;
    }
}