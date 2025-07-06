class Solution {
    public boolean checkValidString(String s) {
        int minOpen = 0, maxOpen = 0; // minOpen: '(' required, maxOpen: '(' + '*'

        for (char c : s.toCharArray()) {
            if (c == '(') {
                minOpen++; // We need one more '('
                maxOpen++; // '(' contributes to maxOpen too
            } else if (c == ')') {
                minOpen = Math.max(minOpen - 1, 0); // Reduce '(' requirement
                maxOpen--; // ')' reduces max '(' count
            } else { // '*'
                minOpen = Math.max(minOpen - 1, 0); // '*' can act as ''
                maxOpen++; // '*' can act as '('
            }

            if (maxOpen < 0) return false; // More ')' than '(' + '*'
        }

        return minOpen == 0;

        // int open = 0;
        
        // int star =0;
        // int n = s.length();

        // for(int i=0; i<n; i++){
        //     char ch = s.charAt(i);
        //     if(ch == '('){
        //         open++;
        //     }else if(ch == ')'){
        //         open--;
        //     }else if(ch == '*'){
        //         star++;
        //     }
        // }
        // if(open + star == 0){
        //     return true;
        // }else if(open - star <= 0){
        //     return true;
        // }else if(open == 0){
        //     return true;
        // }else{
        //     return false;
        // }
    }
}