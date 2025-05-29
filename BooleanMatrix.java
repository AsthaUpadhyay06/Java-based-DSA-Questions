import java.util.Arrays;

public class BooleanMatrix {
    public static void modifyMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        boolean[] rowMarker = new boolean[rows];
        boolean[] colMarker = new boolean[cols];

        // Step 1: Mark rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    rowMarker[i] = true;
                    colMarker[j] = true;
                }
            }
        }

        // Step 2: Update matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowMarker[i] || colMarker[j]) {
                    matrix[i][j] = 1;
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {0, 0, 1},
            {0, 0, 0},
            {1, 0, 0}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        modifyMatrix(matrix);

        System.out.println("Modified Matrix:");
        printMatrix(matrix);
    }
}