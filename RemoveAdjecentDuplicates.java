import java.util.Stack;
// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/submissions/836657075/
public class RemoveAdjecentDuplicates {
        public String removeDuplicates(String s) {
            if (s.length() <= 1) {
                return s;
            }

            int K = s.length();
            Stack<Character> stack = new Stack();
            char[] arr = new char[K];

            for (int i = 0; i < K; i++) {
                char ch = arr[i];
                System.out.println(ch);
                if (!stack.isEmpty() && stack.peek() == ch) {
                    stack.pop();
                }
                else {
                    stack.add(ch);
                }
            }
            System.out.println(stack);
            return " ";
        }
}


