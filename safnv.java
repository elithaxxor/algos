//import java.util.PriorityQueue;
//
//class Solution {
//    public int lengthOfLastWord(String s) {
//        int count = 0;
//        int slow = 0;
//        PriorityQueue <Character> q = new PriorityQueue<>();
//
//        //    q.add(' ');
//        for (int i = 0; i < s.length() ; i++) {
//            char isSpace = s.charAt(i);
//            count++;
//            if (isSpace == ' ') {
//                while( count < s.length()) {
//                    if (s.charAt(count) == ' ') {
//                        break;
//                    }
//                    q.add(s.charAt(count));
//                    count++;
//
//                }
//            }
//        }
//        System.out.println(q);
//        return q.size();
//    }
//}