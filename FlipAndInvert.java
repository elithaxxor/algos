public class FlipAndInvert {
    public int[][] flipAndInvertImage(int[][] image) {
        int r = image.length;
        int c = image[0].length;
        int R = r * c - 1;

        int C = image[0].length-1;

      //  System.out.println((c + 1) / 2);
        int [][] res = new int [r][c];

        for (int i = 0; i < r; i++) {
            int left =0;
            int right = image[i].length-1;

            while (left <= right ) {
                int temp = image[i][left]^1;
                image[i][left] = image[i][right]^1;
                image[i][right] = temp;
                left++;
                right--;

            }
        }
        return res;

    }

    public static void main(String[] args) {
        FlipAndInvert ip = new FlipAndInvert();
        int[][] arg = new int[][]{
                {1,1,0},
                {1,0,1},
                {0,0,0}};
        ip.flipAndInvertImage(arg);
    }
}
