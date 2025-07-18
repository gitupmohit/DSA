class Solution {
    public int findKthPositive(int[] arr, int k) {
      int j = 0;
      int n = arr.length;
      int i =1;

     while(k>0 && j< n){
        if(arr[j] != i){
            k--;
        }else{
            j++;
        }
        i++;
     }
      if(k != 0){
        return i + k - 1;
      }
      return i -1;
    }
}