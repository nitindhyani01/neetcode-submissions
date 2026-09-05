class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        boolean[] rowZero = new boolean[rows];
        boolean[] colZero = new boolean[cols];
        
        for (int m = 0; m < rows; m++) {
            for (int n = 0; n < cols; n++) {
                if (matrix[m][n] == 0) {
                    rowZero[m] = true;
                    colZero[n] = true;
                }
            }
        }
        
        for (int m = 0; m < rows; m++) {
            for (int n = 0; n < cols; n++) {
                if (rowZero[m] || colZero[n]) {
                    matrix[m][n] = 0;
                }
            }
        }
    }
}