class Solution {
    public String sortVowels(String s) {
        char[] ch = s.toCharArray();
        String vowels = "aeiouAEIOU";
        List<Character> list = new ArrayList<>();

        // Step 1: collect vowels
        for (char c : ch) {
            if (vowels.indexOf(c) != -1) {
                list.add(c);
            }
        }

        // Step 2: sort vowels
        Collections.sort(list);

        // Step 3: put back sorted vowels
        int idx = 0;
        for (int i = 0; i < ch.length; i++) {
            if (vowels.indexOf(ch[i]) != -1) {
                ch[i] = list.get(idx++);
            }
        }

        return new String(ch);
    }
}
