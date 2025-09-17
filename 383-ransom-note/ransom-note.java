class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character , Integer> map1 = new HashMap<>();
        HashMap<Character , Integer> map2 = new HashMap<>();

        for(char ch : ransomNote.toCharArray()){
            map1.put(ch , map1.getOrDefault(ch , 0) + 1);
        }
        for(char ch : magazine.toCharArray()){
            map2.put(ch , map2.getOrDefault(ch , 0) + 1);
        }
        for(char ch : ransomNote.toCharArray()){
            int val1 = map1.get(ch);
            int val2 = 0;
            if(map2.containsKey(ch)){
                val2 = map2.get(ch);
            }else{
                return false;
            }
            if(val1 > val2){
                return false;
            }
        }
        return true;
    }
}