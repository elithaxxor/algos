
// https://leetcode.com/problems/diagonal-traverse/
// diagonal matrix traversal.
// odd col indcates shift right, even indicates shift down.


public class FindDiagonalOrder {

    public int[] findDiagonalOrder(int[][] mat) {
        int R = mat.length;
        int C = mat[0].length;
        int i = 0; int j = 0;


        if (R == 0 || C == 0) { return new int []{}; }
        int [] res = new int[R*C];


        int idx = 0;
        while (idx < R) {
            int sum = i + j;
            int key = sum % 2;
            res[idx] = mat[i][j];

            if (key == 0) {
                if(i < R - 1 && j > 0) {
                    j++;
                    i--;
            }
            j++;
            i++;
            idx++;
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
}
