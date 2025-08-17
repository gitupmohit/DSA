class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> output = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int it : nums1){
            set1.add(it);
        }
        for(int it : nums2){
            set2.add(it);
        }
        List<Integer> list1 = new ArrayList<>();
        for(int it : nums1){
            if(!set2.contains(it)){
                list1.add(it);
                set2.add(it);
            }
        }
        List<Integer> list2 = new ArrayList<>();
        for(int it : nums2){
            if(!set1.contains(it)){
                list2.add(it);
                set1.add(it);
            }
        }
        output.add(list1);
        output.add(list2);
        return output;
    }
}