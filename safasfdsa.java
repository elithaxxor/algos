//import java.util.*;
//
//public class safasfdsa {
//    class Solution {
//        public int missingNumber(int[] nums) {
//            Set<Integer> numSet = new HashSet<Integer>();
//            for (int num : nums) numSet.add(num);
//
//            int expectedNumCount = nums.length + 1;
//            for (int number = 0; number < expectedNumCount; number++) {
//                if (!numSet.contains(number)) {
//                    return number;
//                }
//            }
//            return -1;
//        }
//    }
//
//}
//
//
//
//class Solution {
//    public int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        int i =0;
//        int solution=0;
//
//        HashSet <Integer> set = new HashSet();
//
//
//        // Ensure that n is at the last index
//        if (nums[nums.length-1] != nums.length) {
//            return nums.length;
//        }
//        // Ensure that 0 is at the first index
//        else if (nums[0] != 0) {
//            return 0;
//        }
//
//
//        for(int j = 1; i < nums.length; i++) {
//            System.out.println("arr " + nums[i]);
//            set.add(nums[i]);
//
//            if(!set.contains(nums[i] - nums[j] != 1)
//            i++;
//
//        }
//        return solution;
//
//    }
//
//}
//
//
