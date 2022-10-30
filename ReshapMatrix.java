import java.util.*;

public class ReshapMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        Queue<Integer> q = new LinkedList<>();
        int row = mat.length;
        int col = mat[0].length;

        int[][] res = new int[r][c];

        if (mat.length == 0 || r * c != mat.length * mat[0].length) {
            return mat;
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                q.add(mat[i][j]);
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = q.remove();
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int r = 2;
        int c = 4;
        int[][] input = new int[][]{{1, 2}, {3, 4}};
        ReshapMatrix rs = new ReshapMatrix();
        int[][] res = rs.matrixReshape(input, r, c);

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j]);
            }
        }

    }
}
