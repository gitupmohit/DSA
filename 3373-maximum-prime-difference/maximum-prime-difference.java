class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int n = nums.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
    //     for(int i = 0; i<n; i++){
    //         if(prime(nums[i])){
    //             min = Math.min(i , min);
    //             max = Math.max(i , max);
    //         }
    //     }
    //     return max - min;
    // }

    // public boolean prime(int n){
    //     if(n <= 1) return false;
    //     if(n == 2) return true;
    //     if(n % 2 == 0) return false;

    //     for(int i=3; i*i<=n; i+=2){
    //         if(n % i == 0) return false;
    //     }
    //     return true;
        boolean[] prime = new boolean[n];
        Arrays.fill(prime,true);
        for (int i = 0; i < n; i++) {
        int num = nums[i];
        if (num <= 1) {
            prime[i] = false;
        } else if (num == 2) {
            prime[i] = true;
        } else if (num % 2 == 0) {
            prime[i] = false;
        } else {
            for (int j = 3; j * j <= num; j += 2) {
                if (num % j == 0) {
                    prime[i] = false;
                    break;
                }
            }
        }

        if (prime[i]) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
    }

    return max == Integer.MIN_VALUE ? 0 : max - min;

    }
}