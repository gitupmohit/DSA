class Solution {
    public int[] sumZero(int n) {
        if(n == 2) return new int[] {-1,1};
        int[] arr = new int[n];
        int sum = 0;
        for(int i=0; i<n-1; i++){
            arr[i] = i;
            sum += i;
        }
        arr[n-1] = -sum;
        return arr;
    }
}