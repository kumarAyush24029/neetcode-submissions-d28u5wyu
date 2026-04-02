

class Solution {
    public boolean isValidSudoku(char[][] board) {

        // check rows & columns
        for (int i = 0; i < 9; i++) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();

            for (int j = 0; j < 9; j++) {

                // row check
                if (board[i][j] != '.') {
                    if (board[i][j] < '1' || board[i][j] > '9' || row.contains(board[i][j])) {
                        return false;
                    }
                    row.add(board[i][j]);
                }

                // column check
                if (board[j][i] != '.') {
                    if (board[j][i] < '1' || board[j][i] > '9' || col.contains(board[j][i])) {
                        return false;
                    }
                    col.add(board[j][i]);
                }
            }
        }

        // check 3×3 boxes
        for (int r = 0; r < 9; r += 3) {
            for (int c = 0; c < 9; c += 3) {

                HashSet<Character> box = new HashSet<>();

                for (int i = r; i < r + 3; i++) {
                    for (int j = c; j < c + 3; j++) {

                        if (board[i][j] != '.') {
                            if (box.contains(board[i][j])) {
                                return false;
                            }
                            box.add(board[i][j]);
                        }
                    }
                }
            }
        }

        return true;
    }
}
