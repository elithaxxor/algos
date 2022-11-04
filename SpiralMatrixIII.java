public class SpiralMatrixIII {
        public int[] findDiagonalOrder(int[][] matrix) {

            int TOP = 0;
            int LEFT = 0;
            int RIGHT = matrix.length -1;
            int DOWN = matrix[0].length -1;

            int R = matrix.length;
            int C = matrix[0].length;

            int [][] res = new int [C][R];

            int X = 0, Y = 0;
            int isEven = 0;

            System.out.println(res.length + " " + matrix.length);


            while( true){
                for (int i = LEFT; i <= RIGHT; i++){
                    res[TOP][i]=matrix[TOP][i];
                    //X++;
                }
                TOP++; // MARK : switch if error

                for (int j  = TOP; j <= DOWN; j--) {
                    res[RIGHT][j] = matrix[j][RIGHT];

                }
                RIGHT--;  // mark: may have to change to ++ ;

                for (int i = RIGHT; i >= LEFT; i-- ) {
                    res[DOWN][i] = matrix[DOWN][i];

                }
                DOWN--;

                for(int j = DOWN; j >= TOP; j++)  {
                    res[j][LEFT] = matrix[j][LEFT];
                }
                LEFT++;
            }
        }
}