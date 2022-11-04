public class MinimumCostCandles {
            public int minimumCost(int[] cost) {
                int min = Integer.MAX_VALUE;
                int total = 0;
                int c = 0;
                int N = cost.length;

                for (int i = N-1 ; i >= 0 ;i--) {

                    if(!(i % 3 == 0)) {
                        total += cost[i];
                    }
                    System.out.println("current min -> "+min);
                    System.out.println("current total -> "+total);
                }
                return total;
            }
        }

