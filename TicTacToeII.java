public class TicTacToeII {
        char[][] board = new char [3][3];
        public String tictactoe(int[][] moves) {

            char p1 = 'X';
            char p2 = 'O';
            int movesLeft = 9, count = 0;
            for(int [] move : moves) {
                int r = move[0];
                int c =move[1];

                System.out.println("r "+ r);
                System.out.println("c "+ c);


                board[r][c] = p1;
                count++;
                while(movesLeft >= 0){
                    // mark : set up basecase checks
                    if(count %2 == 0) {
                        board[r][c] = p2;
                        movesLeft--;
                    } else {
                        board[r][c] = p1;
                        movesLeft--;
                    }}

            }


            return "Pending";

        }
    }

}
