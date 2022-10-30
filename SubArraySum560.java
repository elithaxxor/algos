import java.util.HashMap;
import java.util.Map;

public class SubArraySum560 {
    public int subarraySum(int[] nums, int k) {

        int sum = 0; int count = 0;
        HashMap <Integer, Integer> map = new HashMap();

        map.put(0, 1);

        for(int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            int key =sum-k ;

            System.out.println("key -> " + key);
            if (map.containsKey(key)) {

                // get i to grab the sub index. the count moves the window.
                System.out.println("MAP key -> " + map.get(key));
                count+=map.get(key);

            }

            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        System.out.println(map);

        return count;
    }

    public static void main(String[] args) {
        int [] arg = new int[] {1, 1,1};
        int target = 2;
        SubArraySum560 sa = new SubArraySum560();
        int r = sa.subarraySum(arg, target);

        System.out.println("res 1 -> " + r);

    }
}
