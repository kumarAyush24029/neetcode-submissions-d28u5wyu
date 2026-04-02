class Solution {

    public int orangesRotting(int[][] grid) {

        record Cell(int i, int j) {} // declare first

        Deque<Cell> queue = new ArrayDeque<>(); // now Java knows Cell

        int fresh = 0;
        int minutes = 0;

        int rows = grid.length;
        int columns = grid[0].length;

        // fill queue + count fresh
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new Cell(i, j));
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        while (!queue.isEmpty() && fresh > 0) {

            int size = queue.size();

            for (int k = 0; k < size; k++) {

                Cell cell = queue.poll();

                int i = cell.i();
                int j = cell.j();

                if (j + 1 < columns && grid[i][j + 1] == 1) {
                    grid[i][j + 1] = 2;
                    queue.offer(new Cell(i, j + 1));
                    fresh--;
                }

                if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                    grid[i][j - 1] = 2;
                    queue.offer(new Cell(i, j - 1));
                    fresh--;
                }

                if (i + 1 < rows && grid[i + 1][j] == 1) {
                    grid[i + 1][j] = 2;
                    queue.offer(new Cell(i + 1, j));
                    fresh--;
                }

                if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                    grid[i - 1][j] = 2;
                    queue.offer(new Cell(i - 1, j));
                    fresh--;
                }
            }

            minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }
}