class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<n; i++){
            String ss = tokens[i];
            if(ss.equals("+")){
                int val1 = s.pop();
                int val2 = s.pop();
                int ans = val2 + val1;
                s.push(ans);
            }else if(ss.equals("/")){
                int val1 = s.pop();
                int val2 = s.pop();
                int ans = val2 / val1;
                s.push(ans);
            }else if(ss.equals("-")){
                int val1 = s.pop();
                int val2 = s.pop();
                int ans = val2 - val1;
                s.push(ans);
            }else if(ss.equals("*")){
                int val1 = s.pop();
                int val2 = s.pop();
                int ans = val2 * val1;
                s.push(ans);
            }else{
                s.push(Integer.parseInt(ss));
            }
        }
        return s.peek();
    }
}