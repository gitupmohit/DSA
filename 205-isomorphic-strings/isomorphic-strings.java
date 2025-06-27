class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> map1 = new HashMap<>();
        int n = s.length();
        int m = t.length();

        if(n != m) return false;

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            char ch1 = t.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch) != ch1){
                    return false;
                }
            }else if(map1.containsKey(ch1)){
                if(map1.get(ch1) != ch){
                    return false;
                }
            }
            else{
                map.put(ch,ch1);
                map1.put(ch1,ch);
            }
        } 
        return true;
    }
}