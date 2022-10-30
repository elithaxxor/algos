public class MinSubArrayLen {
    public int minSubArrayLen(int target, int[] nums) {

        int res = 0; int r = 0; int l = 0;
        int K = nums.length;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        while (r < K) {
            sum += nums[r];
            while ( target <= sum) {
                int window = r-l+1;
                min = Math.min( window, min);
                sum-= nums[l];
                System.out.println("max -> " + min);
                System.out.println("sum -> " + sum );
                l++;
            }
            r++;
        }
        return min;

    }

    public static void main(String[] args) {

        MinSubArrayLen run = new MinSubArrayLen();
        int[] arg = new int[]{2,3,1,2,4,3};
        int t = 7;
        int r = run.minSubArrayLen(t, arg);
        System.out.println("res -> " + r
        );
    }

    }
