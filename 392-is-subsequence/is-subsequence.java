class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        int i = 0;
        int j = 0;
        if(n == 0) return true;

        while(i < n && j < m){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(j);
            if(i == n-1){
                if(ch1 == ch2){
                    return true;
                }
            }
            if(ch1 == ch2){
                i++;
                j++;
            }else{
                j++;
            }
        }
        return false;
    }
}