public class SubArraySumII {

    public int subarraySumI(int[] nums, int k) {
        int sum = 0; int count = 0;
        int N = nums.length;
        int L=0; int R=0;

        int window = 0;
        while(R < N) {
            sum+=nums[R];
            while (L < k) {
                 window = L-R+1;
                System.out.println("window -> " + window );
                sum-=nums[L];
                L++;
                if (sum == k ) {
                    System.out.println(" sum = k (current count)_ " + count );
                    count++;
                }

            }
            R++;
        }
        return window;
    }

    public int subarraySumII(int [] nums, int k ) {
        int N = nums.length;
         int count = 0;


        for (int i = 0; i < nums.length; i++ ) {
            for (int j = i+1; j <= nums.length; j++) {
                int sum = 0;

                // mark brute force
                for (int ij = i; ij < j; ij++ ) {
                    sum+=nums[ij];
                }
                if (sum == k ) {
                    count++;
                }
            }
        }

        return count;
    }


    public static void main(String[] args) {
        int [] arg = new int[] {1, 1,1};
        int target = 2;
        SubArraySumII sa = new SubArraySumII();
        int r = sa.subarraySumI(arg, target);
        int r2 = sa.subarraySumII(arg, target);

        System.out.println("res 1 -> " + r);
        System.out.println("res 2 -> " + r2);



    }
}