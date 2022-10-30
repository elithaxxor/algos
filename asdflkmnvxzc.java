//import java.security.KeyStore;
//import java.util.*;
//
//class Solution {
//    private  int count = 0;
//    private int count2 = 0;
//    public void setZeroes(int[][] matrix) {
//        int n = matrix.length;
//        int m = matrix[0].length;
//        int [] [] dp = new int [n][m];
//        int [] [] dp2 = new int [n][m];
//
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++){
//                dp[i][j] = matrix [i][j];
//                // dp[i][0] = matrix[i][0];
//
//                if (dp[i][j] == 0) {
//                    System.out.println("dp ij == 0 ");
//                   // colShift(matrix, i, j);
//                }
//                if (dp[i][0] == 0) {
//                    System.out.println("dp i 0  == 0 ");
//
//                    colShift(matrix, i, j);
//                    continue;
//                }
//                //    dp2[0][j] = matrix[0][j];
//                if (dp[0][j] == 0) {
//                    System.out.println("dp 0 j == 0 ");
//                    rowShift(matrix, i, j);
//                    continue;
//                }
//            }
//        }
//    }
//    public void colShift (int [] [] mat, int r, int c) {
//
//        // base case
//        if ( r> mat.length || c > mat[0].length ||  c < 0  || r < 0 || count >= mat.length) {
//            System.out.println("end of col shift ");
//            return ;
//        }
//        System.out.println("shifting col..  ");
//        mat[count][0] = 0;
//        count++;
//        colShift(mat, count++, c);
//
//    }
//    public void rowShift (int [] [] mat, int r, int c ) {
//        // base case
//        if (c > mat[0].length || c > mat.length || c < 0 || r < 0 || count2 >= mat[0].length) {
//            System.out.println("end of row shift ");
//            return ;
//        }
//        System.out.println("shifting row..  ");
//        mat[0][count2] = 0;
//        count2++;
//        rowShift(mat, r, count2++);
//    }
//}
//
//
//
//class Solution {
//    public void setZeroes(int[][] matrix) {
//        Boolean isCol = false;
//        int R = matrix.length;
//        int C = matrix[0].length;
//
//        for (int i = 0; i < R; i++) {
//            // Since first cell for both first row and first column is the same i.e. matrix[0][0]
//            // We can use an additional variable for either the first row/column.
//            // For this solution we are using an additional variable for the first column
//            // and using matrix[0][0] for the first row.
//            if (matrix[i][0] == 0) {
//                isCol = true;
//            }
//            for (int j = 1; j < C; j++) {
//                // If an element is zero, we set the first element of the corresponding row and column to 0
//                if (matrix[i][j] == 0) {
//                    matrix[0][j] = 0;
//                    matrix[i][0] = 0;
//                }
//            }
//        }
//        // Iterate over the array once again and using the first row and first column, update the elements.
//        for (int i = 1; i < R; i++) {
//            for (int j = 1; j < C; j++) {
//                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//        // See if the first row needs to be set to zero as well
//        if (matrix[0][0] == 0) {
//            for (int j = 0; j < C; j++) {
//                matrix[0][j] = 0;
//            }
//        }
//        // See if the first column needs to be set to zero as well
//        if (isCol) {
//            for (int i = 0; i < R; i++) {
//                matrix[i][0] = 0;
//            }
//        }
//    }
//}
//class Solution {
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//
//        // Hash table for keeping track of the numbers in the array
//        // Note that we can also use a set here since we are not
//        // really concerned with the frequency of numbers.
//        HashMap<Integer, Boolean> hashTable = new HashMap<Integer, Boolean>();
//
//        // Add each of the numbers to the hash table
//        for (int i = 0; i < nums.length; i++) {
//            hashTable.put(nums[i], true);
//        }
//
//        // Response array that would contain the missing numbers
//        List<Integer> result = new LinkedList<Integer>();
//
//        // Iterate over the numbers from 1 to N and add all those
//        // that don't appear in the hash table.
//        for (int i = 1; i <= nums.length; i++) {
//            if (!hashTable.containsKey(i)) {
//                result.add(i);
//            }
//        }
//
//        return result;
//    }
//}
//
//
//
//
//
//class Solution {
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//
//        Arrays.sort(nums);
//        List<Integer> res = new LinkedList<Integer>();
//        HashMap<Integer, Boolean> map = new HashMap();
//
//        for (int num : nums) {
//            map.put(num, true);
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            if (map.contains(nums[i])) {
//                res.add(nums[i]);
//            }
//        }
//        System.out.println(map);
//        return res;
//    }
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
//
//
//
//
//
//
//
//
//class Solution {
//    public int findDuplicate(int[] nums) {
//
//        HashMap <Integer, Integer> map = new HashMap();
//        Arrays.sort(nums);
//        for (int i : nums) {
//            map.put(i, map.getOrDefault(i, 0)+1);
//        }
//
//
//        int res = 0;
//        for(int i=0; i < map.size(); i++ ) {
//            if (map.containsKey(2)) {
//                System.out.println("contians ");
//                res = map.getValue(2);
//            }
//        }
//        System.out.println(map);
//
//        return res;
//
//    }
//
//
//}
//
//
//
//
//class Solution {
//    public int findDuplicate(int[] nums) {
//
//        HashMap <Integer, Integer> map = new HashMap();
//        Arrays.sort(nums);
//        for (int i : nums) {
//            map.put(i, map.getOrDefault(i, 0)+1);
//        }
//
//        int res = 0;
//        HashMap <Integer, Boolean> map2 = new HashMap();
//
//        for(int i=0; i < map.size(); i++ ) {
//            if (map2.containsKey(nums[i])) {
//                map2.put(nums[i], false );
//            } else {
//                map2.put(nums[i], true);
//            }
//        }
//        System.out.println(map2);
//
//        for(int i=0; i < map.size(); i++ ) {
//            if (map.containsKey(2)) {
//                System.out.println("contians ");
//                res = map.get(2);
//            }
//        }
//        System.out.println(map);
//        return res;
//    }
//}
//
//
//
//class Solution {
//    public int longestConsecutive(int[] nums) {
//        Arrays.sort(nums);
//        if (nums.length < 1 ) {  return 0;  }
//
//        HashMap < Integer, Boolean> map = new HashMap();
//
//        for (int i = 0; i < nums.length; i++ ) {
//
//            for (int j = i++; j < nums.length; j++ ) {
//                int sum = nums[i] - nums[j];
//                System.out.println("Summation => " + sum );
//                if (nums[j] - nums[i] == 1  ) {
//                    map.put(nums[i], true);
//                }
//                else {
//                    map.put(nums[i], false );
//
//                }
//
//            }
//
//
//        }
//        System.out.println(map);
//
//        return 1;
//
//    }
//}
//
//
//
//        int count = 1;
//        int fast = 1;
//        for (int i = 0; i < nums.length && fast < nums.length; i++, fast++) {
//
//        }
//
//        return count;
//}
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
//
//
//class Solution {
//    public int longestConsecutive(int[] nums) {
//        Arrays.sort(nums);
//        if (nums.length < 1 ) {  return 0;  }
//
//        HashMap < Integer, Boolean> map = new HashMap();
//
//        for (int i = 0; i < nums.length; i++ ) {
//
//            for (int j = i; j < nums.length; j++ ) {
//                int sum = 0;
//                sum += nums[i] + nums[j];
//                System.out.println(sum);
//                System.out.println("Summation => " + sum);
//                if (sum - nums[j] == 1) {
//                    map.put(nums[i], true);
//                } else {
//                    map.put(nums[i], false);
//                }
//            }
//            System.out.println(map);
//
//
//
//                for (Map.Entry<Integer, Boolean> entry : map.entrySet() ) {
//
//                    if (entry.getKey())
//            }
//        }
//        System.out.println(map);
//
//        return 1;
//
//    }
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
//
//
//
//
