public class IslandPerminter {
    int r;
    int c;
        public int islandPerimeter(int[][] grid) {
            r = grid.length;
            c = grid[0].length;
            int up, down, right, left;
            int res = 0;
            for (int row = 0; row < grid.length; row++) {
                for (int col = 0; col < grid[0].length; col++) {
                    if (grid[row][col] == 1) {
                        // MARK - Set up directions.
                        if (row == 0) {
                            up = 0;
                        } else {
                            up = grid[row - 1][col];
                        }
                        if (col == 0) {
                            left = 0;
                        } else {
                            left = grid[row][col - 1];
                        }
                        if (row == r - 1) {
                            down = 0;
                        } else {
                            down = grid[row + 1][col];
                        }
                        if (col == c - 1) {
                            right = 0;
                        } else {
                            right = grid[row][col + 1];
                        }
                        res += 4 - (up + left + down + right);
                    }
                }
            }
            return res;
        }

        public static void main(String[] args) {
            IslandPerminter ip = new IslandPerminter();
            int [][] arg = new int [][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0,}, {1, 1, 0, 0}};
            int res = ip.islandPerimeter(arg);
            System.out.println("RES ->" + res);
        }
    }