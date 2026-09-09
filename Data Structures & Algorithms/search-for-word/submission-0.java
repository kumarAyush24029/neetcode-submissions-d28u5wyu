

class Solution {

    public static class pair {
        int row;
        int col;

        pair(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;

            if (!(obj instanceof pair)) return false;

            pair p = (pair) obj;

            return this.row == p.row && this.col == p.col;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, col);
        }
    }

    public static boolean is_present(
            char[][] board,
            String word,
            List<pair> camefrom,
            int row,
            int col) {

        // Word completely matched
        if (word.length() == 0) {
            return true;
        }

        // Out of bounds
        if (row < 0 || row >= board.length ||
            col < 0 || col >= board[0].length) {
            return false;
        }

        // Already used this cell
        if (camefrom.contains(new pair(row, col))) {
            return false;
        }

        // Current character doesn't match
        if (board[row][col] != word.charAt(0)) {
            return false;
        }

        // Add current cell
        camefrom.add(new pair(row, col));

        // Try all 4 directions
        boolean found =
                is_present(board, word.substring(1), camefrom, row + 1, col) ||
                is_present(board, word.substring(1), camefrom, row - 1, col) ||
                is_present(board, word.substring(1), camefrom, row, col + 1) ||
                is_present(board, word.substring(1), camefrom, row, col - 1);

        // Backtrack
        camefrom.remove(new pair(row, col));

        return found;
    }

    public boolean exist(char[][] board, String word) {

        List<pair> camefrom = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (is_present(board, word, camefrom, i, j)) {
                    return true;
                }
            }
        }

        return false;
    }
}