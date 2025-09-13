class Solution {
    public int maxFreqSum(String s) {
        int vow = 0;
        int con =0;
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        String ss = "aeiou";
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            map.put(ch , map.getOrDefault(ch , 0) +1);
            int val = map.get(ch);
            if(ss.indexOf(ch) != -1){
                vow = Math.max(val , vow);
            }else{
                con = Math.max(con , val);
            }
        }
        return vow+con;
        
    }
}