public class MinSubArrayLenII {

    public int minSubArrayLen(int target, int[] nums) {

        int res = 0; int R = 0; int L = 0;
        int K = nums.length;
        int sum = 0;
        int max = Integer.MAX_VALUE;

        while (R < K) {
            sum+=nums[R];
            while (target <= sum) {
                int window = R-L+1;
                sum-=nums[L];
                max=Math.min(max, window);
                L++;
            }

            R++;
        }
        return max == Integer.MAX_VALUE ? 0 : max;

    }


    public static void main(String[] args) {

        MinSubArrayLenII run = new MinSubArrayLenII();
        int[] arg = new int[]{2,3,1,2,4,3};
        int t = 7;
        int r = run.minSubArrayLen(t, arg);
        System.out.println("res -> " + r
        );
    }

}

