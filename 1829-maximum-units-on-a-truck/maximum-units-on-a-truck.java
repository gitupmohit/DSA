class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int output =0;
        Arrays.sort(boxTypes , (a,b) -> Integer.compare(b[1] , a[1]));

        for(int[] it : boxTypes){
            int nb = it[0];
            int nbu = it[1];
            if(truckSize == 0){
                break;
            }else if(nb>truckSize){
                output += truckSize * nbu;
                truckSize = 0;
            }else{
                output += nb * nbu;
                truckSize -= nb;
            }
        }
        return output;
    }
}