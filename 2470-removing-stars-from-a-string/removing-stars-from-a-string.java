class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ss = new StringBuilder();
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '*'){
                if(!st.isEmpty()){
                    st.pop();
                    continue;
                }
            }
            st.push(ch);
        }
        while(!st.isEmpty()){
            char ch = st.pop();
            ss.append(ch);
        }
        ss.reverse();
        return ss.toString();
    }
}