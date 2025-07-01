class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int m = nums2.length;
       int[] nge = new int[m];
       Stack<Integer> st = new Stack<>();

       for(int i=m-1; i>=0; i--){
        int num = nums2[i];

        while(!st.isEmpty() && st.peek()<=num){
            st.pop();
        }

        if(st.isEmpty()){
            nge[i] = -1;
        }else{
            nge[i] = st.peek();
        }
        st.push(num);
       }

int[] result = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
        for (int j = 0; j < m; j++) {
            if (nums1[i] == nums2[j]) {
                result[i] = nge[j];
                break;
            }
        }
    }

    return result;
}
}