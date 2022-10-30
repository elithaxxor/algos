public class IslandPermiterIII {
    public int islandPerimeter(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int res = 0;
        int end = r * c -1 ;
        int permiter = 0;
        int count = 0;
        for (int i = 0; i < r; i++ ) {
            for(int j = 0; j < c; j++) {
                if (grid[i][j] == 1 ) {
                    System.out.println("found grid at + " + grid[i][j]);
                    permiter += dfs (grid, i,j);

                }
            }
        }
        return permiter;
    }
    public int dfs(int [][] mat, int i, int j) {

        // left , right , up , down,
        int sum = 0;
        if (j - 1 < 0 || mat[i][j-1] == 0 ) {sum++;}
        if (j + 1 >= mat[0].length || mat[i][j+1] == 0) {sum++;}
        if (i + 1 >= mat.length || mat[i+1][j] == 0) { sum++;}
        if (i - 1 < 0 || mat[i-1][j] == 0 ) { sum++; }

        return sum;
    }
    public static void main(String[] args) {
        IslandPermiterIII ip = new IslandPermiterIII();
        int [][] arg = new int [][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0,}, {1, 1, 0, 0}};
        int res = ip.islandPerimeter(arg);
        System.out.println("RES ->" + res);
    }
}


