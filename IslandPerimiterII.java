public class IslandPerimiterII {
    public int islandPerimeter(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int res = 0;
        int end = r * c -1 ;

        int permiter = 0;

        int up, down, left, right;

        int count = 0;
        for (int i = 0; i < r; i++ ) {
            for(int j = 0; j < c; j++) {
                if (grid[i][j] == 1 ) {
                    System.out.println("found grid at + " + grid[i][j]);
                    permiter+=4;
                    if (i > 0) {
                        permiter -= grid[i-1][j];
                        System.out.println("grid at edge i -> "  + grid[i-1][j]);
                        System.out.println("permiter -> " + permiter);
                    }
                    if (j > 0) {
                        permiter -= grid[i][j-1];
                        System.out.println("grid at edge j -> "  + grid[i][j-1]);
                        System.out.println("permiter -> " + permiter);
                    }
                    if (i < r -1 ) {
                        permiter -= grid[i+1][j];
                        System.out.println("grid at edge i+1 -> "  + grid[i+1][j]);
                        System.out.println("permiter -> " + permiter);
                    }
                    if (j < c-1 ) {
                        permiter -= grid[i][j+1];
                        System.out.println("grid at edge j+1 -> "  + grid[i][j+1]);
                        System.out.println("permiter -> " + permiter);
                    }
                }
            }
        }
        return permiter;
    }


    public static void main(String[] args) {
        IslandPerimiterII ip = new IslandPerimiterII();
        int[][] arg = new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        int r = ip.islandPerimeter(arg);
        System.out.println(r);
    }
}
