public class ClmibingStairs {
        public int climbStairs(int n) {
            int total = 0;
            int [] dp = new int[n];
            dp[1] = 1;
            dp [2] = 2;

            for (int i = 3; i <= n; i ++ ) {
                dp[i] = dp[i-1] + dp[i-2];
            }
            return dp.length;

            // return climbStairs(0 , n );

        }

        public int climbStairs(int total, int n) {

            if (total > n) {
                return 0;
            }
            if (total == n) {
                return total;
            } // mark : if total = 0 or 1.

            return climbStairs(total+1, n) + climbStairs(total+2, n );

        }
    }

