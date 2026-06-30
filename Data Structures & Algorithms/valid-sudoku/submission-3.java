class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[0].length; col++) {
                if(board[row][col] != '.' && !check(board, row, col)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean check(char[][] board, int row, int col) {
        char ch = board[row][col];
        for(int r = 0; r < board.length; r++) {
            if(r == row) {
                continue;
            }
            if(board[r][col] == ch) return false;
        }

        for(int c = 0; c < board.length; c++) {
            if(c == col) {
                continue;
            }
            if(board[row][c] == ch) return false;
        }

        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        
        for(int r = startRow; r < startRow + 3; r++) {
            for(int c = startCol; c < startCol + 3; c++) {
                if(r == row && c == col) {
                    continue;
                }
                
            if(board[r][c] == ch) return false;
            }
        }
        return true;
    }
}
