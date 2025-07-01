class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        int n = nums2.length;
        for(int i=n-1; i>=0; i--){
            int num = nums2[i];
            while(!st.isEmpty() && st.peek()<num){
                st.pop();
            }
            if(st.isEmpty()){
                map.put(num,-1);
            }
            if(!st.isEmpty()){
                map.put(num,st.peek());
            }
            st.push(num);
        }

        int m = nums1.length;
        int[] arr = new int[m];
        for(int i=0; i<m; i++){
            arr[i] = map.get(nums1[i]);
        }
        return arr;
    }
}