class Solution {
   public static boolean exist(char[][] board, String word) {
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[0].length; col++) {
                if(dfs(board,word, row, col, 0, new HashSet<>())) return true;
            }
        }

        return false;
    }

    private static boolean dfs(char[][] board, String word, int row, int col, int i, Set<List<Integer>> set) {
        if(i == word.length()) return true;

        if(row < 0 || col < 0 ||
                row >= board.length || col >= board[0].length ||
                word.charAt(i) != board[row][col] || (set.contains(List.of(row, col)))) return false;

        set.add(List.of(row, col));
        boolean res = dfs(board, word, row+1, col, i+1, set) || dfs(board, word, row-1, col, i+1, set) ||
                dfs(board, word, row, col+1, i+1, set) || dfs(board, word, row, col-1, i+1, set);
        set.remove(List.of(row, col));
        return res;
    }

    //  public static boolean exist(char[][] board, String word) {
    //     for(int row = 0; row < board.length; row++) {
    //         for(int col = 0; col < board[0].length; col++) {
    //             if(dfs(board,word, row, col, 0, new HashSet<>())) return true;
    //         }
    //     }

    //     return false;
    // }

    // private static boolean dfs(char[][] board, String word, int row, int col, int i, Set<Character> set) {
    //     if(i == word.length()) return true;

    //     if(row < 0 || col < 0 ||
    //             row >= board.length || col >= board[0].length ||
    //             word.charAt(i) != board[row][col] || set.contains(board[row][col])) return false;

    //     set.add(board[row][col]);
    //     boolean res = dfs(board, word, row+1, col, i+1, set) || dfs(board, word, row-1, col, i+1, set) ||
    //             dfs(board, word, row, col+1, i+1, set) || dfs(board, word, row, col-1, i+1, set);
    //     set.remove(board[row][col]);
    //     return res;
    // }
}
