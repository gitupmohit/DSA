class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while(n != 1 && !set.contains(n)){
            set.add(n);
            n = dfs(n);
        }
        return n==1;
    }
    public int dfs(int n){
        int digit = 0;
        while(n > 0){
            int sum = n%10;
            digit += sum*sum;
            n = n/10;
        }
        return digit;
    }
}