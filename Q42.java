 public class Q42 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = matrix.length;
        
        System.out.println("Main Diagonal:");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println("\nSecondary Diagonal:");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][n - 1 - i] + " ");
        }
    }
}