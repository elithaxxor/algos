import java.util.*;

public class ThirdMax {
    public int thirdMax(int[] nums) {

        Arrays.sort(nums);

        Stack <Integer> stack = new Stack<>();
        Queue <Integer> q = new PriorityQueue<>();
        int res = 0;
        int N = nums.length;
        int fast = 1;
        int count = 0;

        for (int i = 0; i < nums.length && fast < nums.length; i++) {

            if (nums.length < 3) {
                int end = nums.length-1;
                return nums[end];
            }

            res += nums[fast];
            stack.add(nums[i]);
            q.offer(nums[i]);

            while(!q.isEmpty()) {
            //while (q.size() <= nums.length) {
                int temp = q.remove();
                System.out.println( "temp " + temp);
                System.out.println( "res " + res);
//                int window = fast - i;
//                System.out.println("window " + window);

                if(temp != res) {
                    count++;
                    int window = fast - i;
                    fast = fast+window;
                    System.out.println("window " + window);
                    break;
                }
            }
            fast++;
            q.poll();
        }

        return count;
    }

    public static void main (String [] args ) {
        int [][] arg = new int [][] {{0,1}, {1,2}};
        String arg2 = "aeiouu";
        int [] arg3 = new int [] {3,2,1};

        ThirdMax f = new ThirdMax();
        int res = f.thirdMax(arg3);
        System.out.println("res -> " + res);

    }

}

