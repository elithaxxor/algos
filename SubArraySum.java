import java.util.HashMap;

public class SubArraySum {

    public int subarraySum(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int difference = k - sum;

            if(map.containsKey(difference)) {
                System.out.println("difference " + count);
                count+=map.get(difference);
            }
            map.put(sum, i);
        }
        System.out.println(map);
        return count;
    }

    public static void main(String[] args) {
        int [] arg = new int[] {1, 1, 0, 9, 43, 43};
        int target = 9;
        SubArraySum sa = new SubArraySum();
        int r = sa.subarraySum(arg, target);
        System.out.println(r);

    }
}


