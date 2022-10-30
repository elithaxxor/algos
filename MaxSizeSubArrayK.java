import java.util.HashMap;
import java.util.*;

public class MaxSizeSubArrayK {
    public int maxSubArrayLenII(int[] nums, int k) {

        int sum = 0; int count = 0;
        int L = 0; int R = 0;
        int max = Integer.MIN_VALUE;
        int N = nums.length;

        while (R < N) {
            sum+=nums[R];
            int key = sum - k ;

            while (sum != key && L < N  ) {
                int window = L-R+1;
                max = Math.max(max, window);
                sum -= nums[L];
                L++;
                System.out.println("contracting window " + window );
                System.out.println("max val " + max );

            }
            if ( sum == key) {
                count++;
            }

            R++;
        }

        System.out.println("count -> " + count);

        return max;
    }


    public int maxSubArrayLen(int[] nums, int k) {
        int sum = 0; int count = 0;
        int L = 0; int R = 0;
        int max = Integer.MIN_VALUE;
        int N = nums.length;


        Map<Integer, Integer> map = new HashMap<>(); // sum | index
        map.put(0, -1);


        for (int i = 0; i < N; i++ ) {
            sum+=nums[i];
            int key = sum - k ;

            if (map.containsKey(key)) {
                System.out.println("contains key ! " + key );
                max = Math.max(max, i - map.get(key));

            }

            map.putIfAbsent(sum, i);

        }

        System.out.println("count  ! " + count );
        return max == Integer.MIN_VALUE ? 0 : max;

    }


        public static void main(String[] args) {
        int [] arg = new int[] {-2,-1,2,1};
        int target = 1;
        MaxSizeSubArrayK sa = new MaxSizeSubArrayK();
        int r = sa.maxSubArrayLen(arg, target);
        System.out.println(r);

    }
}
