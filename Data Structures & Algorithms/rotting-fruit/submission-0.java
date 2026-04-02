class Solution {
    int rows, cols;

    public int orangesRotting(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;

        int[][] time = new int[rows][cols];

        // Initialize time with max value
        for (int i = 0; i < rows; i++) {
            Arrays.fill(time[i], Integer.MAX_VALUE);
        }

        // Run DFS from every rotten orange
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    dfs(grid, i, j, 0, time);
                }
            }
        }

        int maxTime = 0;

        // Check result
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    if (time[i][j] == Integer.MAX_VALUE) return -1;
                    maxTime = Math.max(maxTime, time[i][j]);
                }
            }
        }

        return maxTime;
    }

    private void dfs(int[][] grid, int i, int j, int t, int[][] time) {

        // boundary + optimization check
        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == 0 || t >= time[i][j]) {
            return;
        }

        // update minimum time
        time[i][j] = t;

        // explore all directions
        dfs(grid, i + 1, j, t + 1, time);
        dfs(grid, i - 1, j, t + 1, time);
        dfs(grid, i, j + 1, t + 1, time);
        dfs(grid, i, j - 1, t + 1, time);
    }
}