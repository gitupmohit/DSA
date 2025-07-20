class Solution {
    public long splitArray(int[] nums) {
        long primeSum = 0;
        long nonPrimeSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(i)) {
                primeSum += nums[i];
            } else {
                nonPrimeSum += nums[i];
            }
        }

        return Math.abs(primeSum - nonPrimeSum);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
