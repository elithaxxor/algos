import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0; i < nums.length; i++ ) {
            map.put(nums[i], i );
        }

        System.out.println(map);

        for(int i =0; i < nums.length; i++ ) {
            int difference = target - nums[i];
            System.out.println(difference);

            if(map.containsKey(difference) && map.get(i) != i) {
                return new int []{map.get(difference), i};
            }

        }
        return new int [] {0, 0};

        }

    public static void main(String[] args) {
        int [] arg = new int[] {1, 1, 0, 9, 43, 43};
        int target = 9;
        TwoSum f = new TwoSum();
        f.twoSum(arg, target);
    }
}