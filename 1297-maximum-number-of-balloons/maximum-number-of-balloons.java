class Solution {
    public int maxNumberOfBalloons(String text) {
        // HashMap<Character, Integer> map = new HashMap<>();
        // int n = text.length();
        // String s = "balloonBALLOON";
        // for(char ch : text.toCharArray()){
        //     map.put(ch , map.getOrDefault(ch , 0) +1);
        // }
        // int min = Integer.MAX_VALUE;
        // for(char ch : text.toCharArray()){
        //     int val = map.get(ch);
        //     if(ch == 'l' || ch == 'o' || ch == 'L' || ch == 'O'){
        //         min = Math.min(min , val/2);
        //     }else if(s.indexOf(ch) != -1){
        //         min = Math.min(min , val);
        //     }
        // }
        // if(!map.containsKey('b') || !map.containsKey('a') ||!map.containsKey('l') ||!map.containsKey('o') ||!map.containsKey('n') ||!map.containsKey('n')){
        //     return 0;
        // }
        // return min;
        int len=text.length();
        int b=0;
        int a=0;
        int l=0;
        int o=0;
        int n=0;
       
        for(char c:text.toCharArray()){
            if(c=='b')b++;
            else if(c=='a')a++;
            else if(c=='o')o++;
            else if(c=='l')l++;
            else if(c=='n')n++;
           
        }
        l/=2;
        o/=2;
        return Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))));
    }
}