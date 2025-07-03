class Solution {
    public char kthCharacter(int k) {
        StringBuilder s = new StringBuilder();
        s.append('a');
        int n = s.length();

        while(n<k){
           for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            char chi = 'a';
            if(ch != 'z'){
                chi =(char)(ch + 1);
            }else{
               chi = 'a';
            }
            s.append(chi); 
           }
           n = s.length(); 
        }
        return s.charAt(k-1);
    }
}