class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int max = Integer.MIN_VALUE;

        for(int i =0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                if(colors[i] != colors[j]){
                    max = Math.max(max,j-i);
                }
            }
        }
        return max;
    }
}