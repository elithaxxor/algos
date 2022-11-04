class SpiralMatrixIII {
    public void setZeroes(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        int x = 0;
        int y = 0;
        int end = R * C - 1;
        int idx = 0;
        System.out.println("end " + end);

        while (idx <= end)
            for (int i = 0; i < R; i++) {

                for (int j = 0; j < C; j++) {
                    if (matrix[i][0] == 0) {
                        while(x <= R) {
                            matrix[x][0] = 0;
                            x++;
                        }
                        idx++;
                    }
                    if (matrix[0][j] == 0) {
                        while(y <= C) {
                            matrix[0][y] = 0;
                            y++;
                        }
                    }
                }
                idx++;
                System.out.println("end " + idx);
            }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(matrix[i][j] );
            }
        }
    }
public static void main(String[] args) {
    int[][] input = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    SpiralMatrixIII run = new SpiralMatrixIII();
    run.setZeroes(input);
}
}