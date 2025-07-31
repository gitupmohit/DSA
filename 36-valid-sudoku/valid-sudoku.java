class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[][] boxes = new HashSet[3][3]; // 3x3 grid of boxes

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
        }

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                boxes[i][j] = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char val = board[i][j];

                if (val == '.') continue;

                // Check row
                if (rows[i].contains(val)) return false;
                rows[i].add(val);

                // Check column
                if (cols[j].contains(val)) return false;
                cols[j].add(val);

                // Check box
                if (boxes[i / 3][j / 3].contains(val)) return false;
                boxes[i / 3][j / 3].add(val);
            }
        }
        return true;
    }
}
