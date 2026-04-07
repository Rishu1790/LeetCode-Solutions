class Solution {
    // 1. The main method LeetCode calls
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    // 2. Your 'sudoku' method renamed to 'solve' with 'char' types
    public boolean solve(char[][] board, int row, int col) {
        if (row == 9) return true;

        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // Check for '.' instead of 0
        if (board[row][col] != '.') {
            return solve(board, nextRow, nextCol);
        }

        // Loop using chars '1' through '9'
        for (char digit = '1'; digit <= '9'; digit++) {
            if (isSafe(board, row, col, digit)) {
                board[row][col] = digit;
                if (solve(board, nextRow, nextCol)) return true;
                board[row][col] = '.'; // Backtrack using '.'
            }
        }
        return false;
    }

    // 3. Your 'isSafe' method updated for 'char'
    public boolean isSafe(char[][] board, int row, int col, char digit) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == digit) return false;
            if (board[i][col] == digit) return false;
        }

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == digit) return false;
            }
        }
        return true;
    }
}