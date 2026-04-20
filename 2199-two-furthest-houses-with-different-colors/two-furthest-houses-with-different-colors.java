class Solution {
    public int maxDistance(int[] colors) {
    //     int n = colors.length;
    //     int max = Integer.MIN_VALUE;

    //     for(int i =0; i<n-1; i++){
    //         for(int j = i+1; j<n; j++){
    //             if(colors[i] != colors[j]){
    //                 max = Math.max(max,j-i);
    //             }
    //         }
    //     }
    //     return max;
    int dis = 0;
       int n = colors.length;
       for(int i=0;i<n-1;i++){
        if(colors[i] != colors[n-1]){
            dis = Math.max(dis ,(n-1)-i);
            break;
        }
       }
      

       for(int i=n-1;i>=1;i--){
        if(colors[0]!=colors[i]){
        dis = Math.max(dis,i);
       }
       }
       return dis;
    }
    // }
}