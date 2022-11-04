
// https://leetcode.com/problems/diagonal-traverse/
// https://www.youtube.com/watch?v=ZaTWa5s1ndI&list=PL1MJrDFRFiKaqGdb3lM27Bqk5EKpVm2-r&index=2
// diagonal matrix traversal.
// odd col indcates shift right, even indicates shift down.


public class FindDiagonalOrder {

    public int[] findDiagonalOrder(int[][] mat) {
        int R = mat.length;
        int C = mat[0].length;
        int x = 0;
        int y = 0;


        if (R == 0 || C == 0) {
            return new int[]{};
        }
        int[] res = new int[R * C];


        int idx = 0;
        while (idx < R) {
            int sum = x + y;
            int key = sum % 2;
            res[idx] = mat[y][x];

            // mark: traversal. 1st start with L & R boundries, then controll
            if (key == 0) { // mark: even
                if (x < C - 1 && y > 0) { //[UP and RIGHT]
                    x++;
                    y--;
                } else if (x < C - 1) { //[RIGHT] (IF SPACE AVAILABLE)
                    x++;
                } else { //[DOWN]
                    y++;
                }

            } else { // [mark] index -
                if (y < R - 1 && x > 0) { // [LEFT and DOWN]
                    x--;
                    y++;
                } else if (y < R - 1) { // [DOWN]
                    y++;
                } else {
                    x++; // [RIGHT]
                }
                y++;
                x++;
                idx++;
            }
        }
        return res;
    }
        public static void main(String[] args) {
            FindDiagonalOrder ip = new FindDiagonalOrder();
        int[] []arg = new int [][]{{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}};
        int [] r = ip.findDiagonalOrder(arg);
        System.out.println("res -> " + r);
    }
}

