public class LongestCommonPrefix {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            int N = strs.length;
            Stack <Character> stack = new Stack();
            stack.add('\0');
            for (int i = 1; i< N; i++) {
                String prefix = strs[i-1];
                String str = strs[i];
                int M = str.length();

                int j = 0;
                while (j < M) {
                    char ch = prefix.charAt(j);

                    char prev = stack.pop();
                    if(str.charAt(j) == ch) {

                        System.out.println("found prefix -> " + ch );
                        stack.add(ch);
                        j++;

                    }
                }
            }
            return stack.toString();
        }
    }

}
