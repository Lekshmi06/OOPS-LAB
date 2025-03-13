public class SymmetricMatrixCheck {
    public static boolean isSymmetric(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false; 
                }
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };

        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matrix1 is symmetric: " + isSymmetric(matrix1)); 
        System.out.println("Matrix2 is symmetric: " + isSymmetric(matrix2)); 
    }
}
