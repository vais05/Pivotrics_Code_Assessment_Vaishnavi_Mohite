public class Main {

    // Function to count the number of islands
    public static int numIslands(char[][] grid) {

        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        int islands = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == '1') {
                    islands++;
                    dfs(grid, i, j);
                }

            }
        }

        return islands;
    }

    // DFS to mark connected land as visited
    private static void dfs(char[][] grid, int row, int col) {

        if (row < 0 ||
            col < 0 ||
            row >= grid.length ||
            col >= grid[0].length ||
            grid[row][col] == '0') {

            return;
        }

        grid[row][col] = '0';

        dfs(grid, row + 1, col);
        dfs(grid, row - 1, col);
        dfs(grid, row, col + 1);
        dfs(grid, row, col - 1);
    }

    public static void main(String[] args) {

        char[][] grid = {

                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}

        };

        int result = numIslands(grid);

        System.out.println("Number of Islands = " + result);
    }
}