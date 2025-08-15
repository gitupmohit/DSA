class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        int i = 0;
        int j = n-1;
        char[] arr = s.toCharArray();
        while(i <= j){
            char ch = arr[i];
            boolean ch1 = true;
            char ch2 = arr[j];
            boolean ch3 = true;
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
                ch1 = true;
            }else{
                ch1 = false;
            }
            if(ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u' || ch2 == 'A' || ch2 == 'E' || ch2 == 'I' || ch2 == 'O' || ch2 == 'U' ){
                ch3 = true;
            }else{
                ch3 = false;
            }
        if(ch1 && ch3){
           arr[i] = ch2;
            arr[j] = ch;
            i++;
            j--;
        }else if(ch1 == true && ch3 == false){
            j--;
        }else{
            i++;
        }
        }
        return new String(arr);
    }
}