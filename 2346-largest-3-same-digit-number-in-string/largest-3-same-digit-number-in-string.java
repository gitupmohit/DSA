class Solution {
    public String largestGoodInteger(String num) {
        int n = num.length();
        char a = 'a';
        int c = 0;
        String s = "";
        int max =  -1;
        int k = 0;

        for(int i=0; i<n; i++){
            char ch = num.charAt(i);
            if(ch == a){
                c++;
            }else{
                c = 1;
                a = ch;
            }
            if(c == 3){
               if(a - '0' > max){
                max = a - '0';
                k = i-2;
               }
            }
        }
        if(max > -1) return num.substring(k,k+3);
        return "";
    }
}