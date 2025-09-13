class Solution {
    public int maxFreqSum(String s) {
        int vow = 0;
        int con =0;
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                int maxi = map.get(ch);
                vow =Math.max(maxi,vow);
            }else{
                int maxi2 = map.get(ch);
                con = Math.max(maxi2,con);
            }
        }
        return vow+con;
        
    }
}