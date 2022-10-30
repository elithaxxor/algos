import java.util.Arrays;
import java.util.*;

public class ThirdMaxII {

    public int thirdMax(int[] nums) {
        int N = nums.length;
        HashSet<Integer> set = new HashSet<>();
        HashMap<Boolean, Integer> map= new HashMap<>();

        Arrays.sort(nums);

        if (nums.length < 3) {
            System.out.println("returning smaller len than 3 " + nums[nums.length-1] );
            return nums[nums.length-1];
        }

        for (int i = 0; i < nums.length; i++) {

            if (!map.containsValue(nums[i])) {
                System.out.println("found non unique " + nums[i]);
                map.put( false,  nums[i]);
            }
          //  map.put(true, nums[i]) ;
            System.out.println("sorted array " + nums[i]);
        }

        System.out.println("map " + map);

       // int res = map.get();
        return N;
    }


        public static void main(String[] args) {

            ThirdMaxII run = new ThirdMaxII();
        int[] arg = new int[]{3,2,1,1,4,4};
        int r = run.thirdMax(arg);
        System.out.println("res -> " + r
        );
    }
}

