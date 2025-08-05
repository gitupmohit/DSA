class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int m = baskets.length;
        int c = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(fruits[i] <= baskets[j]){
                    c++;
                    baskets[j] = 0;
                    break;
                }
            }
        }
        return n-c;
    }
}