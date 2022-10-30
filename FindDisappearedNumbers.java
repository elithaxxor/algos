import java.util.*;

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {

            Arrays.sort(nums);
            LinkedList<Integer> res = new LinkedList<Integer>();
            HashMap<Integer, Boolean> map = new HashMap<>();

            for (int i = 0; i < nums.length;  i++) {
                map.put(i, true);
            }
            System.out.println(map);

            for (int i = 1; i <= nums.length; i++ ) {
                if(!map.containsKey(i)) {
                    res.add(i);
                }

            }
            return res;
        }

    public static void main(String[] args) {

        FindDisappearedNumbers run = new FindDisappearedNumbers();
        int[] arg = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        run.findDisappearedNumbers(arg);
    }

}