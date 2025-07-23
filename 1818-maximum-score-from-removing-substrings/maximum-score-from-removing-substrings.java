class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x > y) {
            return process(s, 'a', 'b', x, y);
        } else {
            return process(s, 'b', 'a', y, x);
        }
    }

    private int process(String s, char first, char second, int val1, int val2) {
        Stack<Character> stack = new Stack<>();
        int score = 0;

        // First pass: remove all (first + second) combinations for higher value
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == first && c == second) {
                stack.pop();
                score += val1;
            } else {
                stack.push(c);
            }
        }

        // Now build the remaining string and remove the other pair
        Stack<Character> stack2 = new Stack<>();
        while (!stack.isEmpty()) {
            char c = stack.pop();
            if (!stack2.isEmpty() && stack2.peek() == first && c == second) {
                stack2.pop();
                score += val2;
            } else {
                stack2.push(c);
            }
        }

        return score;
    }
}
