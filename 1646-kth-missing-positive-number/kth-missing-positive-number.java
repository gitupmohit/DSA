class Solution {
    public int findKthPositive(int[] arr, int k) {
      int count = 0;
      int j = 0;
      int n = arr.length;

      for(int i = 1; i<=1000 + k; i++){
        if(j < n){
            if(arr[j] != i){
            count++;
            }else{
            j++;
            }
        }else{
            count++;
        }
        if(count == k){
            return i;
        }
      }
        return -1;
    }
}