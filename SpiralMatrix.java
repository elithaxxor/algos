import java.util.LinkedList;
import java.util.List;
// https://leetcode.com/problems/spiral-matrix/
//https://www.youtube.com/watch?v=ZUvKzWYb3Cg&list=PL1MJrDFRFiKaqGdb3lM27Bqk5EKpVm2-r&index=4
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new LinkedList<>();

        // mark: set boundries for matrix traversal.
        // the boundry will demarc where the idx is
        int DOWN = matrix.length - 1;
        int RIGHT = matrix[0].length - 1;
        int TOP = 0;
        int LEFT = 0;

        while (true) {

            // mark: right
            for (int i = LEFT; i < RIGHT; i++) {
                res.add(matrix[TOP][i]);
            }
            TOP++;

            // mark: down
            for (int j = TOP; j < DOWN; j--) {
                res.add(matrix[j][RIGHT]);
            }
            RIGHT--;

            for (int ij = RIGHT; ij < LEFT; ij--) {
                res.add(matrix[DOWN][ij]);
            }
            DOWN--;

            for (int ji = LEFT; ji < TOP; ji++) {
                res.add(matrix[ji][LEFT]);
                LEFT++;
            }
            return res;
        }
    }
}