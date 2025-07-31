class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;

        // Check rows
        for (int i = 0; i < n; i++) {
            HashSet<Character> rowSet = new HashSet<>();
            for (int j = 0; j < n; j++) {
                char ch = board[i][j];
                if (ch == '.') continue;
                if (rowSet.contains(ch)) return false;
                rowSet.add(ch);
            }
        }

        // Check columns
        for (int j = 0; j < n; j++) {
            HashSet<Character> colSet = new HashSet<>();
            for (int i = 0; i < n; i++) {
                char ch = board[i][j];
                if (ch == '.') continue;
                if (colSet.contains(ch)) return false;
                colSet.add(ch);
            }
        }

        // Check 3x3 boxes
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {
                HashSet<Character> boxSet = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char ch = board[boxRow + i][boxCol + j];
                        if (ch == '.') continue;
                        if (boxSet.contains(ch)) return false;
                        boxSet.add(ch);
                    }
                }
            }
        }

        return true;
    }
}
