//import java.util.List;
//// https://www.youtube.com/watch?v=pdRZrjlqSbs&list=PL1MJrDFRFiKZJ5q5ddQYHbAlfReUx1muX&index=4
//// https://leetcode.com/problems/encode-and-decode-strings/
//
//
//// to encode and decode ->
//// create delimiter and a way to seperate different values
//public class Codec {
//
//    private char delimiter = '#';
//
//    // Encodes a list of strings to a single string.
//    public String encode(List<String> strs) {
//        int N = strs.size();
//        // mark: build stringbuilders
//        StringBuilder sb = new StringBuilder() ;
//        for(String str: strs)
//        {
//            sb.append(N);
//            sb.append(delimiter);
//            sb.append(str);
//        }
//        return sb.toString();
//
//    }
//
//    // Decodes a single string to a list of strings.
//    public List<String> decode(String s) {
//        int N = s.length();
//        List<String> res = new LinkedList<>();
//        char[] arr = s.toCharArray();
//
//        // mark: append everything except delmiter:
//
//        for (int i = 0 ; i < N; i ++ ) {
//
//            StringBuilder sb = new StringBuilder();
//            while(arr[i] != delimiter) {
//                sb.append(arr[i]);
//                i++;
//            }
//            i++;
//            System.out.println("arr without delmiter -> " + arr[i]);
//
//
//            // mark: spawn new sb and iterate entire list iteration.
//            int numChars = Integer.parseInt(sb.toString());
//            //int numChars = Integer.valueOf(sb.toString());
//
//            int end = i + numChars;
//            sb = new StringBuilder();
//            while ( i < end ) {
//                sb.append(arr[i]);
//                i++;
//            }
//            i--;
//        }
//
//    }
//}
