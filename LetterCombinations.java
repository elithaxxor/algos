//import java.util.*;
//
//public class LetterCombinations {
//    class Solution {
//
//        List<String> combinations = new ArrayList<>();
//
//        Map<Character, String> letters = Map.of(
//                '2', "abc",
//                '3', "def",
//                '4', "ghi",
//                '5', "jkl",
//                '6', "mno",
//                '7', "pqrs",
//                '8', "tuv",
//                '9', "wxyz");
//
//
//        public List<String> letterCombinations(String digits) {
//            List<String> combinations = new ArrayList<>();
//            String phoneDigits;
//            System.out.println(letters);
//            int index = 0;
//
//
//            backtrack(0, new StringBuilder());
//            return combinations;
//        }
//
//        public void backtrack(int index, StringBuilder sb) {
//            if (index > sb.length()) {
//                combinations.add(String.valueOf(sb.indexOf(letters.get(index))));
//                return;
//            }
//
//
//            sb.append(letters.get(index));
//            combinations.add(sb.toString());
//
//            System.out.println(letters.entrySet());
//            backtrack(index++, sb);
//            sb.deleteCharAt(sb.length() -1 );
//
//        }
//    }
//
//
//}
//
