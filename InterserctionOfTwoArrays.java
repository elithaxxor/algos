//https://leetcode.com/problems/intersection-of-two-arrays-ii/

import java.util.*;

public class InterserctionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        class Solution {
            public int[] intersect(int[] nums1, int[] nums2) {


                if (nums1.length <= 2){
                    return nums1;}
                if (nums2.length <= 2){ return nums2;}

                if (1000 <=  nums2.length) {return nums1; }

                HashSet<Integer> set = new HashSet();
                for(int i : nums2)  {
                    set.add(i);
                }
                System.out.println("set 1 " + set);
                HashSet <Integer> set2 = new HashSet();
                int idx =0;
                int N1 = nums1.length;

                int [] res = new int []{0, 0};

                for(int j : nums1) {
                    if(set.contains(j)) {
                        set2.add(j);
                        res[idx] = j;
                        System.out.println("idx " + res[idx] );
                    }
                    System.out.println("set 2 " + set);
                    idx++;
                }

                int [] result = new int [set2.size()];
                int count = 0;
                for (int i : set2) {
                    result[count++] = i;
                }

            }
        }
    }
}
