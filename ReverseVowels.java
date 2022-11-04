import java.util.*;

public class ReverseVowels {
    public String reverseVowels(String s) {


        int N = s.length();

        char[] charArr = s.toCharArray();
        Map<Integer, Character> map = new HashMap<>();
        Stack stack = new Stack();

        int start = 0;
        int end = N - 1;
        for (char ch : charArr) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                stack.push(ch);

            }
        }


        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {

            //    if(map.containsValue(p1)  ) {
            //         swap(charArr, end, start );
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                sb.append(stack.pop());
            } else {
                sb.append(ch);
            }
            start++;
            end--;
        }
        return sb.toString();
    }
}
