//import java.util.Arrays;
//import java.util.HashSet;
//
//class Solution {
//    public int[] intersection(int[] nums1, int[] nums2) {
//        HashSet <Integer> set1 = new HashSet<Integer>();
//        HashSet <Integer> set2 = new HashSet<Integer>();
//
//        for(int i : nums1) { set1.add(i); }
//        for(int i : nums2) { set2.add(i); }
//
//        if (set1.size() < set2.size()) {
//            return dfs(set1, set2);
//        } else {
//            return dfs(set2, set1);
//        }
//    }
//
//    public int[] dfs (HashSet set1, HashSet set2) {
//        System.out.println(set1);
//        System.out.println(set2);
//        int [] res = new int [set1.size()];
//
//        int count = 0;
//        for (Integer i : set1) {
//            if (set2.contains(i)) {
//                res[count++] = i;
//            }
//        }
//        System.out.println( Arrays.copyOf(res, count));
//
//        return Arrays.copyOf(res, count);
//    }
//}
//
//class Solution {
//    public int[][] indexPairs(String text, String[] words) {
//        HashSet <String> set = new HashSet();
//        StringBuilder  sb = new StringBuilder();
//        char [] charTxt = text.toCharArray();
//
//        int count = 0;
//        for (String s : words ) {
//            char c = s.charAt(count);
//            set.add(s);
//            sb.append(s);
//            count++;
//
//
//            if(charTxt[count] == sb.charAt(count)) {
//                System.out.println("found matches");
//            }
//        }
//        System.out.println(set);
//
//        return new int [0] [0];
//    }
//}
//
//
//
//
//
//
//class Solution {
//    public int[] set_intersection(HashSet<Integer> set1, HashSet<Integer> set2) {
//        int [] output = new int[set1.size()];
//        int idx = 0;
//        for (Integer s : set1)
//            if (set2.contains(s)) output[idx++] = s;
//
//        return Arrays.copyOf(output, idx);
//    }
//
//    public int[] intersection(int[] nums1, int[] nums2) {
//        HashSet<Integer> set1 = new HashSet<Integer>();
//        for (Integer n : nums1) set1.add(n);
//        HashSet<Integer> set2 = new HashSet<Integer>();
//        for (Integer n : nums2) set2.add(n);
//
//        if (set1.size() < set2.size()) return set_intersection(set1, set2);
//        else return set_intersection(set2, set1);
//    }
//}
//
//
//
//class Solution {
//    public int[][] indexPairs(String text, String[] words) {
//        HashSet <String> set = new HashSet();
//        StringBuilder  sb = new StringBuilder();
//        char [] charTxt = text.toCharArray();
//
//        int count = 0;
//        for (String s : words ) {
//            char c = s.charAt(count);
//            set.add(s);
//            sb.append(s);
//            if(charTxt[count] == sb.charAt(count)) {
//                System.out.println("found matches");
//            }
//            count++;
//        }
//        System.out.println(set);
//
//        return new int [0] [0];
//    }
//}
