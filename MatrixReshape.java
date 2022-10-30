import java.util.LinkedList;
import java.util.Queue;

public class MatrixReshape {
    int [][] res;
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int row = mat.length;
        int col = mat[0].length;


        res = new int [r][c];
        System.out.println("change row to " + r );
        System.out.println("change col to " + c );
        if (mat.length == 0 || r * c != mat.length * mat[0].length)
            return mat;


        int rows = 0;
        int cols = 0;

        for (int i =0 ; i < row; i++) {
            for (int j = 0; j < col; j++ ) {
                res[rows][cols] = mat[i][j];
                cols++;
                if (cols == c ) {
                    rows++;
                    cols = 0;
                }
            }
        }
        return res;
    }

    public int[][] matrixReshapeII(int[][] mat, int r, int c) {
        res = new int [r][c];
        Queue<Integer> q = new LinkedList<>();

        // base case
        if (mat.length == 0 || r * c != mat.length * mat[0].length)
            return mat;


        // mark flatten
        for(int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[0].length; j++) {
                q.add(mat[i][j]);
            }
        }

        // mark build
        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++ ) {
                res[i][j] = q.remove();
            }
        }
        return res;
    }
    public static void main(String[] args) {
        MatrixReshape ip = new MatrixReshape();
        int [][] arg = new int [][]{{1,2}, {3,4}};//
        int[][] r = ip.matrixReshape(arg, 1, 4);
        System.out.println("RES ->" + r);
    }

}

