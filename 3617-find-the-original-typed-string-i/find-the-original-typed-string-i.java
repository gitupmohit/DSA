class Solution {
    public int possibleStringCount(String word) {
        // HashMap<Character,Integer> map = new HashMap<>();
        int count = 1;

        for(int i =0; i<word.length()-1; i++){
            char ch = word.charAt(i);
            char ch1 = word.charAt(i+1);

            if(ch == ch1){
                count++;
            }

            // if(map.containsKey(ch)){
            //     count++;
            //     map.put(ch,map.get(ch) + 1);
            // }else{
            //     map.put(ch,1);
            // }

        }
        return count;
    }
}