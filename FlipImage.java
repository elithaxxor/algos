public class FlipImage {

    int [][] res;
    public int[][] flipAndInvertImage(int[][] image) {

        if (image.length <= 0 || image == null) {
            return image;
        }
        int r = image.length;
        int c = image[0].length;
        int R = r * c -1;
        int mid = (c+1) /2;
        int mid2 = ((c+1) / 2 + (r+1)/2);
        res = image;

        int count = 0;

        for (int i = r - 1; i >= 0; i--) {
            flip(r, c, image);

        }
    return image;
    }

    public void flip (int r, int c, int [] [] image) {

        int left = 0;
        int right = image.length -1;
        while(left < right) {
            int [] temp = image[left];
            image[left] = image[right];
            image[right] = temp;

        }

    }
    public void invert (int r, int c, int [] arr) {

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=1;
            }
            else{
                arr[i]=0;
            }
        }


    }
    public static void main(String[] args) {
        FlipImage ip = new FlipImage();
        int [][] arg = new int[] []{{1, 1, 0}, {1,0,1},{0,0,0}};

        int[][] r = ip.flipAndInvertImage(arg);
        System.out.println("RES ->" + r);
    }
}



