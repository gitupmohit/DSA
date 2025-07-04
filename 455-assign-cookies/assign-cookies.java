class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int l = 0;
        int r = 0;

        while(l<m&&r<n){
            if(s[l]>=g[r]){
                r++;
            }
            l++;
        }
        return r;

        // Arrays.sort(g);
        // Arrays.sort(s);
        // int n = g.length;
        // int m = s.length;
        // int count = 0;
        
        // while(n>0 && m>0){
        //     if(g[n-1]<=s[m-1]){
        //         count++;
        //         n--;
        //         m--;
        //     }else{
        //         n--;
        //     }
            
        // }
        // return count;
    }
}