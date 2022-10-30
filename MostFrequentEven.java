import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class MostFrequentEven {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        int r = nums.length;
        int K = r - 1;

        int even = 0;
        int odd = 1;

        Stack<Integer> stack = new Stack<Integer>();


        int res = 0;
        int freq = 0;
        for (int i = 0; i < r; i++) {
            stack.push(nums[i]);
            if (stack.peek() == nums[i]) {
                freq++;
                while (stack.peek() % 2 == 0 && !stack.isEmpty() && stack.size() < nums.length) {
                    int temp = stack.pop();

                    if (temp != nums[i]) {
                        continue;
                    }
                }
            }

             res = stack.pop();
        }
        return res;
    }
}
//        }
//        public static void main (String[]args){
//            MostFrequentEven ip = new MostFrequentEven();
//            int[] arg = new int[]{1, 1, 1};
//            int rez = ip.mostFrequentEven(arg);
//            System.out.println("RES ->" + rez);
//        }
//    }
//}
