class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int m = baskets.length;
        int[] vis = new int[m];
        int c = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(fruits[i] <= baskets[j] && vis[j] == 0){
                    c++;
                    vis[j] = 1;
                    break;
                }
            }
        }
        return n-c;
    }
}