public class CheckMatrix {
    int[][] res;

    public boolean checkXMatrix(int[][] grid) {
        int r = grid.length;
        int N = grid.length;
        int c = grid[0].length;
        int rlen = grid.length - 1;
        int clen = grid[0].length - 1;
        res = new int[r][c];

        int end = r * c - 1;


        // mark: check diagnols
        for (int i = 0; i < r; i++) {
            if (grid[i][i] == 0 || grid[i][Math.abs(N - i - 1)] == 0) {
                return false;

            }
        }

            // mark check rest of blcok
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (j == i || j == Math.abs(N - j - 1)) {
                        continue;
                    } else if (grid[i][j] != 0) {
                        return false;
                    }

                }

            }
        return true;
    }

    public void dfs(int r, int c) {
        System.out.println("");
    }

    public static void main(String[] args) {
        CheckMatrix ip = new CheckMatrix();
        int[][] arg = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        boolean r = ip.checkXMatrix(arg);
        System.out.println("RES ->" + r);
    }
}



