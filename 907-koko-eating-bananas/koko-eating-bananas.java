class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        int ans=max;
        
        for(int i=1; i<piles.length; i++){
            max = Math.max(piles[i],max);
        }
        int start=1;
        int end =max;

    //     while(start<=end){
    //         int mid =start+(end-start)/2;
    //         int hour = hours(piles,mid);
    //         if(hour<=h){
    //             end=mid-1;
    //         }else{
    //             start=mid+1;
    //         }
    //     }
    //     return start;
    // }

    // public int hours(int[] piles, int hour){
    //     int totalhour =0;

    //     for(int i=0; i<piles.length; i++){
    //         totalhour += Math.ceil((double) piles[i] / hour);
    //     }
    //     return totalhour;
        while(start<=end){
            int mid = start+(end-start)/2;
            int hr = calc(piles,mid);
            if(hr<=h){
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    public int calc(int[] piles, int hour){
        int val = 0;

        for(int i=0; i<piles.length; i++){
            val += Math.ceil((double)piles[i] / hour);
        }
        return val;
    }
}