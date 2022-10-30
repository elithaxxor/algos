import java.util.Arrays;
import java.util.PriorityQueue;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        int N = nums.length;

        if (nums == null || nums.length < 1 ) {
            return 0;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Arrays.sort(nums);
        for (int i = 0; i <  nums.length ; i++ ) {
            System.out.println(nums[i]);
        }
        int count = 0;
        int fast = 1;
        for (int i = 0; i <  nums.length && fast < nums.length; i++ ) {
            if ( Math.abs(nums[fast] - nums[i]) == 1 ) {
                pq.add(nums[i]);
            }
            else if (nums[fast] * nums[i] == nums[fast]  && nums[fast] != 0 && nums[i] != 0) {
                pq.poll();
                pq.poll();
            }
            fast++;
        }
        return pq.size()+1;

    }

    public static void main(String[] args) {
        int k = 0;
        int[] nums = new int[]{0,0,-1};
        LongestConsecutive sa = new LongestConsecutive();
        int r = sa.longestConsecutive(nums);
        System.out.println("r " + r);
    }

}

