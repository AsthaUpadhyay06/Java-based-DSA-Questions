public class Q38 {
    
    
    public static void search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int i = 0, j = cols - 1; // Start from the top-right corner

        while (i < rows && j >= 0) {
            if (matrix[i][j] == target) {
                System.out.println("Element found at (" + i + ", " + j + ")");
                return;
            } else if (matrix[i][j] > target) {
                j--; // Move left
            } else {
                i++; // Move down
            }
        }
        System.out.println("Element not found.");
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int target = 29;
        search(matrix, target);
    }
}
