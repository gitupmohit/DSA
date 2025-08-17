class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i] , 0) +1);
        }

        for(int it : map.values()){
            if(set.contains(it)){
                return false;
            }
            set.add(it);
        }
        return true;
    }
}