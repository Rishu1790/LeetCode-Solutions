class Solution {
    private int count = 0;

    public int totalNQueens(int n) {
        count = 0;
        boolean[] cols = new boolean[n];
        boolean[] leftDiagonals = new boolean[2 * n];
        boolean[] rightDiagonals = new boolean[2 * n];
        solve(0, n, cols, leftDiagonals, rightDiagonals);
        return count;
    }

    private void solve(int row, int n, boolean[] cols, boolean[] leftDiagonals, boolean[] rightDiagonals) {
        if (row == n) {
            count++;
            return;
        }
        for (int col = 0; col < n; col++) {
            int leftDiagIndex = row - col + n;
            int rightDiagIndex = row + col;
            
            if (cols[col] || leftDiagonals[leftDiagIndex] || rightDiagonals[rightDiagIndex]) {
                continue;
            }
            
            cols[col] = true;
            leftDiagonals[leftDiagIndex] = true;
            rightDiagonals[rightDiagIndex] = true;
            
            solve(row + 1, n, cols, leftDiagonals, rightDiagonals);
            
            cols[col] = false;
            leftDiagonals[leftDiagIndex] = false;
            rightDiagonals[rightDiagIndex] = false;
        }
    }
}