import java.util.ArrayList;
import java.util.List;

public class pacificAtlantic {
    public int[][] heightAboveSeaLevel;

    public int rlen;
    public int clen;

    public static final int[][] DIRECTIONS = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

    public List<List<Integer>> pacificAtlanticI(int[][] heights) {

        List<List<Integer>> res = new ArrayList<>();
        int r = heights.length;
        int c = heights[0].length;
        int end = r * c - 1;

        boolean[][] pacific = new boolean[r][c];
        boolean[][] atlantic = new boolean[r][c];
        this.heightAboveSeaLevel = new int[r][c];

        this.rlen = heights.length;
        this.clen = heights[0].length;

        // heightAboveSeaLevel = heights;
        if (r == 0 || c == 0) {
            return new ArrayList<>();
        }

        // mark : traverse edges, establish bounbdries, use DFS to find oceans.
        for (int i = 0; i < r; i++) { // row
            heightAboveSeaLevel[i][0] = heights[i][0];
            dfs(i, 0, atlantic);
            dfs(i, c - 1, pacific);
        }
        for (int j = 0; j < c; j++) { // col
            heightAboveSeaLevel[0][j] = heights[0][j];
            dfs(0, j, atlantic);
            dfs(r - 1, j, pacific);
        }

        return res;
    }






    public void dfs (int r, int c, boolean[][] visited) {

            visited[r][c] = true;
            for (int [] dir : DIRECTIONS) {
                int newRow = r + dir[0];
                int newCol = c + dir[1];
                // check if positions that flow into ocean exist and pos is in bound


                if (newRow < 0 || newRow >= rlen || newCol < 0 || newCol >= clen) {
                     break;
                }
                if (visited[newCol][newRow]) {
                    continue;
                }

                if (heightAboveSeaLevel[newRow][newCol] > heightAboveSeaLevel[r][c]) {
                    continue;
                }
                dfs(newRow, newCol, visited);
            }

        }
    public static void main (String [] args ) {
    int [][] arr = new int [][]{{1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}};

        List<List<Integer>> res = new ArrayList<>();
        pacificAtlantic pa = new pacificAtlantic();
        res = pa.pacificAtlanticI(arr);
        System.out.println(res);
    }
}




class Solution {
    private static final int[][] DIRECTIONS = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    private int numRows;
    private int numCols;
    private int[][] landHeights;

    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        // Check if input is empty
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }

        // Save initial values to parameters
        numRows = matrix.length;
        numCols = matrix[0].length;
        landHeights = matrix;
        boolean[][] pacificReachable = new boolean[numRows][numCols];
        boolean[][] atlanticReachable = new boolean[numRows][numCols];

        // Loop through each cell adjacent to the oceans and start a DFS
        for (int i = 0; i < numRows; i++) {
            dfs(i, 0, pacificReachable);
            dfs(i, numCols - 1, atlanticReachable);
        }
        for (int i = 0; i < numCols; i++) {
            dfs(0, i, pacificReachable);
            dfs(numRows - 1, i, atlanticReachable);
        }

        // Find all cells that can reach both oceans
        List<List<Integer>> commonCells = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (pacificReachable[i][j] && atlanticReachable[i][j]) {
                    commonCells.add(List.of(i, j));
                }
            }
        }
        return commonCells;
    }

    private void dfs(int row, int col, boolean[][] reachable) {
        // This cell is reachable, so mark it
        reachable[row][col] = true;
        for (int[] dir : DIRECTIONS) { // Check all 4 directions
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            // Check if new cell is within bounds
            if (newRow < 0 || newRow >= numRows || newCol < 0 || newCol >= numCols) {
                continue;
            }
            // Check that the new cell hasn't already been visited
            if (reachable[newRow][newCol]) {
                continue;
            }
            // Check that the new cell has a higher or equal height,
            // So that water can flow from the new cell to the old cell
            if (landHeights[newRow][newCol] < landHeights[row][col]) {
                continue;
            }
            // If we've gotten this far, that means the new cell is reachable
            dfs(newRow, newCol, reachable);
        }
    }
}
