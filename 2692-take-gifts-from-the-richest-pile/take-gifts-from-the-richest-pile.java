class Solution {
    public long pickGifts(int[] gifts, int k) {
        int n = gifts.length;

        for(int i=0; i<k; i++){
            int index =0;
            int max =Integer.MIN_VALUE;
            int val =0;
            while(index<n){
                if(gifts[index] > max){
                    val = index;
                    max = gifts[index];
                }
                index++;
            }
            gifts[val] = (int)Math.floor(Math.sqrt(max));
        }
        long sum = 0;
        for(int it : gifts){
            sum+=it;
        }
        return (long)sum;
    }
}