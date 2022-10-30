public class Transpose {
    public int[][] transpose(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;
        int N = matrix.length - 1;

        int[][] res = new int[r][c];
        // mark last element
        // res[r - 1][c - 1] = matrix[c - 1][r - 1];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = matrix[j][i];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Transpose ip = new Transpose();
        int[][] arg = new int[][]{{2, 4, -1}, {-10, 5, 11}, {18, -7, 6}};
        int r[][] = ip.transpose(arg);
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[0].length; j++) {
                System.out.println(r[i][j]);
            }
        }
    }
}


