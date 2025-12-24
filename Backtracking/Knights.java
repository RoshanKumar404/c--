public class Knights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        Knights(board, 0);
    System.out.println(Knights(board,0));
    }


    static int Knights(boolean[][] board, int row) {
        if (row == board.length) {
            printBoard(board);
          //  count+= Knights(board, row);
            System.out.println();
            return 1 ;
        }
 int count= 0;

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
              count +=  Knights(board, row + 1);
                board[row][col] = false; // backtrack
            }
        }
         return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        int[][] moves = {
            {-2, -1}, {-2, 1},
            {-1, -2}, {-1, 2}
        };

        for (int[] move : moves) {
            int r = row + move[0];
            int c = col + move[1];
            if (r >= 0 && c >= 0 && r < board.length && c < board.length) {
                if (board[r][c]) return false;
            }
        }
        return true;
    }

    static void printBoard(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean cell : row) {
                System.out.print(cell ? "K " : ". ");
            }
            System.out.println();
        }
    }
}
