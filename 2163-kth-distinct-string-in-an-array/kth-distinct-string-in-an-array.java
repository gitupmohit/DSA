class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n = arr.length;
        HashMap<String, Integer> map = new HashMap<>();
        // String s = "";

        for(int i=0; i<n; i++){
            map.put(arr[i] , map.getOrDefault(arr[i] , 0) + 1);
        }

        for(int i=0; i<n; i++){
            if(map.get(arr[i]) == 1){
                k--;
            }
            if(k == 0){
                // s+=arr[i];
                // break; 
                return arr[i];
            }
        }
        return "";
    }
}