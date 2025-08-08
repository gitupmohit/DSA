class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            int num = digits[i] + carry;
            carry = num / 10;
            list.add(num % 10);
        }
        if(carry > 0){
            list.add(1);
        }
        Collections.reverse(list);
        int m = list.size();
        int[] arr = new int[m];
        int i = 0;
        for (int it : list) {
            arr[i] = it;
            i++;
        }
        return arr;
    }
}