public class Q47 {
    private static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // Up, Down, Left, Right

    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int count = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == '1') { // Found an island
                    dfs(grid, row, col);
                    count++; // Increase the island count
                }
            }
        }
        return count;
    }

    private static void dfs(char[][] grid, int row, int col) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == '0') {
            return; // Base case: out of bounds or water
        }
        
        grid[row][col] = '0'; // Mark the cell as visited
        
        for (int[] direction : DIRECTIONS) {
            dfs(grid, row + direction[0], col + direction[1]); // Explore neighbors
        }
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };

        System.out.println("Number of islands: " + numIslands(grid));
    }
}