//import java.util.*;
//
//class Solution {
//    public int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        int i =0;
//        int solution=0;
//        HashSet <Integer> set = new HashSet();
//        for (int j : nums) { set.add(j);}
//
//        if (nums.length == 0) {
//            return 1;
//        }
//        System.out.println("set " + set );
//        if (set.isEmpty()  || set.size() == 0 ) {
//            return 1;
//        }
//        for(int j = 1; j < nums.length; i++) {
//            if(!set.contains(i)) {
//                return i;
//            }
//            set.add(i);
//            i++;
//        }
//        return -1;
//    }
//
//}
//
//
//
//
//class Solution {
//    public int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        int i =0;
//        int solution=0;
//        HashSet <Integer> set = new HashSet();
//        for (int j : nums) { set.add(j);}
//
//        System.out.println("set " + set );
//        if (set.isEmpty()) {
//            return 1;
//        }
//        for(int j = 1; j < nums.length; i++) {
//            if(!set.contains(i)) {
//                return i;
//            }
//            set.add(i);
//            i++;
//        }
//        return -1;
//    }
//
//}
//
//
//
//
//class Solution {
//    public int missingNumber(int[] nums) {
//        Set<Integer> numSet = new HashSet<Integer>();
//        for (int num : nums) numSet.add(num);
//
//        int expectedNumCount = nums.length + 1;
//        for (int number = 0; number < expectedNumCount; number++) {
//            if (!numSet.contains(number)) {
//                return number;
//            }
//        }
//        return -1;
//    }
//}
//
//
//
//class Solution {
//    public int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        int i =0;
//        int solution=0;
//        HashSet <Integer> set = new HashSet();
//        for (int j : nums) { set.add(j);}
//
//        System.out.println("set " + set );
//        for(int j = 0; j < nums.length; i++) {
//            if(!set.contains[j]) {
//                return j;
//            }
//            set.add(j);
//        }
//        return -1;
//    }
//
//}
//
//
//
//
//
//
//
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
//        // Ensure that n is at the last index
//        if (nums[nums.length-1] != nums.length) {
//            return nums.length;
//        }
//        // Ensure that 0 is at the first index
//        else if (nums[0] != 0) {
//            return 0;
//        }
//
//        for(int j = 1; j < nums.length; j++) {
//            System.out.println("arr " + nums[i]);
//            set.add(nums[i]);
//
//            if(!set.contains)
//
//                if (nums[i] - nums[j] != 1) {
//                    solution = (nums[i]-nums[j]); //+ nums[j];
//                    System.out.println("Solution -> " + solution);
//
//                    //return solution;
//                }
//            i++;
//
//        }
//        return solution;
//    }
//}
//
//
//class TwoSum {
//    private ArrayList <Integer> res = new ArrayList<>();
//
//    public TwoSum() {
//        this.res = new ArrayList<>();
//    }
//
//    public void add(int number) {
//        res.add(number);
//    }
//
//    public boolean find(int value) {
//        int i = 0;
//        Arrays.sort(res.toArray());
//        int left = 0;
//        int right = res.size();
//
//        while (left > right) {
//            int mid = left + (right - left)/2;
//
//            if (res.get(mid) == value) { return true; }
//            else if (value > res.get(mid) ) {
//                //   res.get(mid++);
//                left++;
//            }
//            else if  (value < res.get(mid)) {
//                //res.get(mid--);
//                right--;
//            }
//
//        }
//        return false;
//    }
//}
//
///**
// * Your TwoSum object will be instantiated and called as such:
// * TwoSum obj = new TwoSum();
// * obj.add(number);
// * boolean param_2 = obj.find(value);
// */
//
