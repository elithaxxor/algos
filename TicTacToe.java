class TicTacToe {
    int [][] board;
    int N = 3;
    int total;
    int end;
    StringBuilder sb = new StringBuilder();

    public String tictactoe(int[][] moves) {

        // set up board
         int player = 1;
         board = new int [N][N];
        end = N-1;
        total = N * N;

        int r = moves.length;
        int c = moves[0].length;


        int count = 0 ;
        for (int [] move : moves) {
            System.out.println("move " + move[count]);
            count++;
            int row = move[0];
            int col = move[1];
            board[row][col] = player;
            System.out.println("player -> " + player);




            // mark: setuup checks and  changes players turn
            if (checkRows(row, player)
                    || checkCols(col, player)
                    || checkDiag(player)
                    || board[row][col] == end
                    || (row == col && checkDiag(player))
                    || (row + col == N - 1 && checkDiag(player))) {
                return player == 1 ? "A" : "B";
            }
            return moves.length == N * N ? "Draw" : "Pending";
        }

        return sb.toString();
    }

    private boolean checkRows (int row, int player) {
        for (int i = 0; i < N; i++) {
            if (board[row][i] != player) {
                return false;
            }
        }
        return true;
    }


    private boolean checkCols (int row, int player) {
        for(int j = 0; j < N; j++) {
            if(board[0][j] != player) {
                return false;
            }
        }
        return true;

    }

    private boolean checkDiag (int player) {
        for (int d = 0; d < N; d++) {
            if (board[d][d] != player) {
                return false;
            }
        }
        return true;

    }

        private boolean checkAntiDiag (int player) {
            for(int d = 0; d < N; d++) {
                if (board[d][N - 1 - d] != player) {
                    return false;
                }
        }
        return true;
    }

    public static void main(String[] args) {

        TicTacToe t = new TicTacToe();
        int [][] moves = new int [][] { {0,0}, {1, 1}, {0, 1}, {0, 2}, {1, 0},{2,0}};
        String res = t.tictactoe(moves);
        System.out.println(res);
    }
}
//
//class Solution {
//
//    // Initialize the board, n = 3 in this problem.
//    private int[][] board;
//    private int n = 3;
//
//    public String tictactoe(int[][] moves) {
//        board = new int[n][n];
//        int player = 1;
//
//        // For each move
//        for (int[] move : moves){
//            int row = move[0], col = move[1];
//
//            // Mark the current move with the current playrer's id.
//            board[row][col] = player;
//
//            // If any of the winning conditions is met, return the current player's id.
//            if (checkRow(row, player) ||
//                    checkCol(col, player) ||
//                    (row == col && checkDiagonal(player)) ||
//                    (row + col == n - 1 && checkAntiDiagonal(player))){
//                return player == 1 ? "A" : "B";
//            }
//
//            // If no one wins so far, change to the other player alternatively.
//            // That is from 1 to -1, from -1 to 1.
//            player *= -1;
//        }
//
//        // If all moves are completed and there is still no result, we shall check if
//        // the grid is full or not. If so, the game ends with draw, otherwise pending.
//        return moves.length == n * n ? "Draw" : "Pending";
//    }
//
//    // Check if any of 4 winning conditions to see if the current player has won.
//    private boolean checkRow(int row, int player){
//        for (int col = 0; col < n; ++col){
//            if (board[row][col] != player) return false;
//        }
//        return true;
//    }
//
//    private boolean checkCol(int col, int player){
//        for (int row = 0; row < n; ++row){
//            if (board[row][col] != player) return false;
//        }
//        return true;
//    }
//
//    private boolean checkDiagonal(int player){
//        for (int row = 0; row < n; ++row){
//            if (board[row][row] != player) return false;
//        }
//        return true;
//    }
//
//    private boolean checkAntiDiagonal(int player){
//        for (int row = 0; row < n; ++row){
//            if (board[row][n - 1 - row] != player) return false;
//        }
//        return true;
//    }
//}
