package TCS_NQT_QUE;
public class NumberOfIslands {

    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int numberOfIslands = 0;
        // Iterate through each cell in the grid
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == '1') {
                    // If a '1' is found, it is part of an island
                    numberOfIslands++;
                    // Use DFS to mark all connected '1's as visited
                    dfs(grid, row, col);
                }
            }
        }

        return numberOfIslands;
    }

    private static void dfs(char[][] grid, int row, int col) {
        // Boundary conditions to stop DFS
    	// grid[row][col] == '0' game changer
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[row].length || grid[row][col] == '0') {
            return;
        }
        // Mark the current cell as visited by setting it to '0'
        grid[row][col] = '0';

        // Recursively call DFS in all four directions (up, down, left, right)
        dfs(grid, row - 1, col); // up
        dfs(grid, row + 1, col); // down
        dfs(grid, row, col - 1); // left
        dfs(grid, row, col + 1); // right
    }

    public static void main(String[] args) {
        char[][] grid1 = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '1'},
            {'0', '0', '0', '1', '1'},
            {'0', '0', '0', '0', '0'}
        };

        char[][] grid2 = {
            {'1', '0', '1', '0'},
            {'0', '1', '0', '1'},
            {'1', '0', '1', '0'},
            {'0', '1', '0', '1'}
        };

        System.out.println("Number of islands in grid1: " + numIslands(grid1)); // Output: 2
        System.out.println("Number of islands in grid2: " + numIslands(grid2)); // Output: 4
    }
}

