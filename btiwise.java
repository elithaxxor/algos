

//import java.util.HashMap;
//
//class Solution {
//    public int missingElement(int[] nums, int k) {
//        int end = nums.length;
//        int pointA;
//        int pointB ;
//        for (int i = 0; i < end; i++) {
//            pointA = i;
//            pointB = i;
//
//            if (nums[pointA] == nums[pointA]+1 || nums[pointB] == nums[pointA]-1) {
//                continue;
//            }
//            else if (nums[pointA] != nums[pointA]+1) {
//                return nums[pointA]+1;
//            }
//
//            else if (nums[pointA] != nums[pointB]-1) {
//                return nums[pointB]-1;
//            }
//
//            pointA++;
//            pointB--;
//
//        }
//        return k;
//    }
//}
//
//
//
//
//class Solution {
//    public int missingElement(int[] nums, int k) {
//        int end = nums.length;
//        int pointA;
//        int pointB ;
//
//        int left = 0;
//        int right = end;
//        int pivot = 0;
//
//        while (left > right) {
//            pivot = left + (right - left) / 2;
//            if (nums[pivot] == nums[pivot+1] || nums[pivot] == nums[pivot-1]) {
//                continue;
//            }
//
//            else if (nums[pivot] != nums[pivot+1]) {
//                pivot++;
//                return nums[pivot]+1;
//            }
//
//            else if (nums[pivot] != nums[pivot-1]) {
//                pivot--;
//                return nums[pivot]-1;
//            }
//
//
//        }
//        return pivot;
//
//    }
//}
//
//
//// mark DFS algorthim
//
//class Solution {
//    public int[] findPeakGrid(int[][] mat) {
//
//
//        int start = 0;
//        int r = mat.length;
//        int c = mat[0].length;
//        int peak = 0;
//
//        int[][] dp = new int [r][c];
//        for (int i = 0; i < r; i++ ){
//            for (int j = 0; j < c; j++) {
//                dp[i][j] = mat[i][j];
//                dfs(mat, i, j, peak);
//            }
//        }
//          return dp[];
//        }
//    public int dfs (int [][] mat,int r, int c, int max ){
//            if (r <= 0 || c <= 0 || mat.length > r || mat[0].length > c ) {
//                return 0;
//            }
//            max = Math.max(max, dfs(mat, r, c-1, max));
//            max = Math.max(max, dfs(mat, r, c+1, max));
//            max = Math.max(max, dfs(mat, r-1, c, max ));
//            max = Math.max(max, dfs(mat, r+1, c, max));
//
//            return max;
//    }
//}
//
//
//
//class Solution {
//    public boolean wordPattern(String pattern, String s) {
//
//        String [] words = s.split(" ");
//
//        HashMap <Integer, Character > map = new HashMap<>();
//
//        System.out.println(words);
//
//        for (int i = 0 ; i < s.length(); i++) {
//            char pat = s.charAt(i);
//
//            if (!map.containsKey(pat)) {
//            } else {
//                map.put(pat);
//            }
//        }
//        return false ;
//    }
//}
//
//
//class Solution {
//    public boolean wordPattern(String pattern, String s) {
//        HashMap <Character, String> map_char = new HashMap();
//        HashMap <String, Character> map_word = new HashMap();
//        String[] words = s.split(" ");
//
//        if (words.length != pattern.length())
//            return false;
//
//        for (int i = 0; i < words.length; i++) {
//            char c = pattern.charAt(i);
//            String w = words[i];
//            if (!map_char.containsKey(c)) {
//                if (map_word.containsKey(w)) {
//                    return false;
//                } else {
//                    map_char.put(c, w);
//                    map_word.put(w, c);
//                }
//
//            } else {
//                String mapped_word = map_char.get(c);
//                if (!mapped_word.equals(w))
//                    return false;
//            }
//        }
//
//        return true;
//    }
//}
//
//
//
//public class Solution {
//    public ListNode oddEvenList(ListNode head) {
//        if (head == null) return null;
//        ListNode odd = head,
//                even = head.next,
//                evenHead = even;
//        while (even != null && even.next != null) {
//            odd.next = even.next;
//            odd = odd.next;
//            even.next = odd.next;
//            even = even.next;
//        }
//        odd.next = evenHead;
//        return head;
//    }
//}
//
//class Solution {
//    public String multiply(String num1, String num2) {
//        int m = num1.length();
//        int n = num2.length();
//        int [] res = new int [m+n];
//
//        if (num1 == "0" || num2 == "0") {
//            return "0";
//        }
//        if (num1 == "1") {
//            return num2;
//        }
//        if (num2 == "1") {
//            return num1;
//        }
//
//        for (int i = m-1; i >=0; i++) {
//            for (int j = n - 1; j >= 0; j++) {
//
//                int product = num1.charAt(i) - '0' * num2.charAt(j) - '0';
//
//                product += res[m - n - 1] % 10;
//                product = res[m - n] / 10;
//            }
//        }
//            StringBuilder sb = new StringBuilder();
//
//            for (int j : res) {
//                sb.append(j);
//            }
//
//
//        return sb.toString();
//
//    }
//}
//
//
//
//
//
//
//class Solution {
//    public int[] findDiagonalOrder(int[][] matrix) {
//
//        // Check for empty matrices
//        if (matrix == null || matrix.length == 0) {
//            return new int[0];
//        }
//
//        // Variables to track the size of the matrix
//        int N = matrix.length;
//        int M = matrix[0].length;
//
//        // The two arrays as explained in the algorithm
//        int[] result = new int[N*M];
//        int k = 0;
//        ArrayList<Integer> intermediate = new ArrayList<Integer>();
//
//        // We have to go over all the elements in the first
//        // row and the last column to cover all possible diagonals
//        for (int d = 0; d < N + M - 1; d++) {
//
//            // Clear the intermediate array every time we start
//            // to process another diagonal
//            intermediate.clear();
//
//            // We need to figure out the "head" of this diagonal
//            // The elements in the first row and the last column
//            // are the respective heads.
//            int r = d < M ? 0 : d - M + 1;
//            int c = d < M ? d : M - 1;
//
//            // Iterate until one of the indices goes out of scope
//            // Take note of the index math to go down the diagonal
//            while (r < N && c > -1) {
//
//                intermediate.add(matrix[r][c]);
//                ++r;
//                --c;
//            }
//
//            // Reverse even numbered diagonals. The
//            // article says we have to reverse odd
//            // numbered articles but here, the numbering
//            // is starting from 0 :P
//            if (d % 2 == 0) {
//                Collections.reverse(intermediate);
//            }
//
//            for (int i = 0; i < intermediate.size(); i++) {
//                result[k++] = intermediate.get(i);
//            }
//
//
