//class Solution {
//    public int[][] indexPairs(String text, String[] words) {
//        HashSet <String> set = new HashSet();
//        StringBuilder  sb = new StringBuilder();
//        char [] charTxt = text.toCharArray();
//        int [][] res = new int [words.length] [words.length];
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
//        //   System.out.println(res[0][0]);
//        return res;
//    }
//}
