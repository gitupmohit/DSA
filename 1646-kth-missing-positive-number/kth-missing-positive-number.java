class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int l = 0;

        for(int it : arr){
            map.put(it , 1);
            min = Math.min(min , it);
            max = Math.max(max , it);
        }

        for(int i = 1; i<=max + k; i++){
            if(!map.containsKey(i)){
                l++;
                if(l == k){
                    return i;
                }
            }
        }
        return -1;
    }
}