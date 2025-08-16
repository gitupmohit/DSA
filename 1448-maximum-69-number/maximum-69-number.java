class Solution {
    public int maximum69Number (int num) {
        int val = 1;
        int ans = 0;
        int rev = revs(num);
        while(rev > 0){
            int digit = rev % 10;
            if(val == 1 && digit == 6){
                ans= ans*10+9;
                val = 0;
            }else{
                ans = ans*10 + digit;
            }
            rev = rev/10;
        }
        return ans;
    }
    public int revs(int n){
        int val = 0;
        while(n > 0){
            val = val*10 + n%10;
            n = n/10;
        }
        return val;
    }
}