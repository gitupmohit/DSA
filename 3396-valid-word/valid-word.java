class Solution {
    public boolean isValid(String word) {
        int n = word.length();
        if(n < 3) return false;
        boolean digit = false;
        boolean vowel = false;
        boolean consonant = false;
        
        for(int i=0; i<n; i++){
            char ch = word.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                vowel = true;
            }else if(ch >= '0' && ch <= '9'){
                digit = true;
            }else if(ch >= 'a' && ch <='z' || ch >= 'A' && ch <='Z'){
                consonant = true;
            }else{
                return false;
            }
        }
        return vowel && consonant;
       

    }
}