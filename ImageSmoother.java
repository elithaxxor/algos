public class ImageSmoother {
    public int[][] imageSmoother(int[][] img) {


        int r = img.length;
        int c = img[0].length;
        int N = r*c-1 ;

        // mark inner 2-d array
        int[][] filter = new int[3][3];
        int n  = 9;


        // mark: carry count wth sub matrix to calculate the mean.

        int count = 0;
        for(int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                // mark build inner box. , use it to find the outside matrix boxes \
                for (int ij = 0; ij < r+1; ij++ ) {
                    for (int ic = 0; ic < c + 1; ic++) {
                        if(ij <= 0  && ic <= 0 ) {
                            filter[ic][ij] += img[ic][ij];
                            count++;
                        }
                    }
                }
                filter[i][j] /= count;
            }
        }
        return filter;
    }

    public static void main(String[] args) {
        ImageSmoother ip = new ImageSmoother();
        int [][] arg = new int [][]{{1,1,1}, {1,0,1}, {1,1,1}};
        int[][] r = ip.imageSmoother(arg);
        System.out.println("RES ->" + r);
    }
}

