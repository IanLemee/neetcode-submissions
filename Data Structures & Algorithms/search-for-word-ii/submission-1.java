class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();

        for(String word : words) {
            for(int row = 0; row < board.length; row++) {
                for(int col = 0; col < board[0].length; col++) {
                    boolean[][] check = new boolean[board.length][board[0].length];
                    if(findWord(board, word, check,row, col, 0) && !res.contains(word)) {
                        res.add(word);
                    }
                }
            }
        }

        return res;
    }

    private boolean findWord(char[][] board, String word, boolean[][] check,int row, int col, int i) {
        if(row >= board.length || 
        col >= board[0].length ||
        row < 0 ||
        col < 0 ||
        word.charAt(i) != board[row][col] || 
        check[row][col]) 
        return false;
        if(i == word.length()-1) {
            return true;
        }

        check[row][col] = true;
        boolean res = findWord(board, word, check, row+1, col, i+1) || 
                findWord(board, word, check, row, col+1, i+1) || 
                findWord(board, word, check, row, col-1, i+1) || 
                findWord(board, word, check, row-1, col, i+1);
        check[row][col] = false;
        return res;
    } 
}
