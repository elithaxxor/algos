import java.util.*;
// https://leetcode.com/problems/degree-of-an-array/
public class DegreeOfArray {
    // The shortest subarray is from the first occurence of x to the last one then you can just code a loop through the array keeping track of counts and indexes. i

        public int findShortestSubArray(int[] nums) {
            int m = nums.length;
            int n = nums.length - 1;
            int sum = 0;
            int maxDegree = 0;

            HashMap<Integer, Integer> map = new HashMap<>();

            int left = 0;
            int [] window = new int[] {0, 0 };

            for (int i : nums) {
                map.put(i, map.getOrDefault(i, 0)+1);
                maxDegree = Math.max(maxDegree, map.get(i));
            }

            System.out.println(maxDegree);
            HashMap <Integer, Integer> degMap = new HashMap<>();


        }

    public int findShortestSubArrayII(int[] A) {
        Map<Integer, Integer> count = new HashMap<>(), first = new HashMap<>();
        int res = 0, degree = 0;
        for (int i = 0; i < A.length; ++i) {
            first.putIfAbsent(A[i], i);
            count.put(A[i], count.getOrDefault(A[i], 0) + 1);
            if (count.get(A[i]) > degree) {
                degree = count.get(A[i]);
                res = i - first.get(A[i]) + 1;
            } else if (count.get(A[i]) == degree)
                res = Math.min(res, i - first.get(A[i]) + 1);
        }
        return res;
    }

}

