import java.util.Stack;

public class MaxRectangleBinaryMatrix {
    
    public static int maxRectangle(int[][] matrix) {
        if (matrix.length == 0) return 0;
        int cols = matrix[0].length;
        int[] heights = new int[cols];
        int maxArea = 0;

        for (int[] row : matrix) {
            // Update histogram heights
            for (int j = 0; j < cols; j++) {
                heights[j] = (row[j] == 0) ? 0 : heights[j] + 1;
            }
            // Compute max rectangle for current histogram
            maxArea = Math.max(maxArea, largestRectangleHistogram(heights));
        }
        return maxArea;
    }

    private static int largestRectangleHistogram(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int h = (i == n) ? 0 : heights[i];
            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 1, 1, 1},
            {1, 0, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 0, 0, 1, 0}
        };
        
        System.out.println("Maximum Rectangle Area: " + maxRectangle(matrix));
    }
} 