package Week_1.Day_4;

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }

        int[][] reshapedMatrix = new int[r][c];
        int newRow = 0;
        int newCol = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                reshapedMatrix[newRow][newCol] = mat[i][j];
                newCol++;

                if (newCol == c) {
                    newCol = 0;
                    newRow++;
                }
            }
        }

        return reshapedMatrix;
    }
}