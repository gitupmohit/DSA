class Solution {
    public int addDigits(int num) {
        int ans = add(num);
        if(ans > 9){
           return addDigits(ans);
        }
        return ans;
    }

    public int add(int n){
        int sum = 0;
        while(n > 0){
            int nu = n % 10;
            sum += nu;
            n = n/10;
        }
        return sum;
    }
}