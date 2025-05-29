 import java.util.Arrays;

public class  Q48 {
    public static int findMedian(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int low = matrix[0][0], high = matrix[rows - 1][cols - 1];

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = countLessEqual(matrix, mid);

            if (count < (rows * cols + 1) / 2) {
                low = mid + 1; // Move right
            } else {
                high = mid; // Move left
            }
        }
        return low;
    }

    private static int countLessEqual(int[][] matrix, int value) {
        int count = 0, cols = matrix[0].length;
        
        for (int[] row : matrix) {
            count += Arrays.binarySearch(row, value) >= 0 ? 
                     (Arrays.binarySearch(row, value) + 1) : 
                     (-Arrays.binarySearch(row, value) - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5},
            {2, 6, 9},
            {3, 6, 9}
        };

        System.out.println("Median: " + findMedian(matrix));
    }
} 