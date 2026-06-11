class NumMatrix {
    private final int[][] matrix;
    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
       int ans = 0;
       for(int rowStart = row1; rowStart <= row2; rowStart++) {
        for(int colStart = col1; colStart <= col2; colStart++) {
            ans += matrix[rowStart][colStart];
        }
       }

       return ans;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */