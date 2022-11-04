import java.util.*;

public class MissingNumber {
        public int missingNumber(int[] nums) {

            int K = nums.length;
            Stack <Integer> stack = new Stack<>();
            stack.add(nums[0]);
            int missing = 0;
            System.out.println("k "+ K);
            Arrays.sort(nums);
            if (nums[0]!=0) { return 0; }
            if(K <= 1) { return nums.length; }
            for (int i = 1; i < K; i++){
                if(nums[i] - stack.peek() == 1) {
                    stack.pop();
                    stack.add(nums[i]-1);
                }
                missing = nums[i]+1;

            }
            System.out.println(stack);
            System.out.println(missing);
            if (nums[nums.length-1] == 1) { return nums.length; }

            //   if(stack.peek() < 0 ) { return missing; }
            return stack.peek()-1;
        }
        public int missingNumberII(int[] nums) {
            Set<Integer> numSet = new HashSet<Integer>();
            for (int num : nums) numSet.add(num);

            int expectedNumCount = nums.length + 1;
            for (int number = 0; number < expectedNumCount; number++) {
                if (!numSet.contains(number)) {
                    return number;
                }
            }
            return -1;
        }
    }
    }