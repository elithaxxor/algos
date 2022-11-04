import java.util.*;

public class ValidParathensisII {
        public boolean isValid(String s) {


            Stack <Character> stack = new Stack();
            HashMap<Character, Character> map = new HashMap<>();

            map.put('(', ')');
            map.put('[', ']');
            map.put('{', '}');


            // if (s.length() % 10 != 0 ) { return false; }


            for (int i = 0; i < s.length() ; i++ ) {

                if(map.containsKey(s.charAt(i))) {
                    System.out.println("pushing " +s.charAt(i));
                    stack.push(s.charAt(i));

                } else {

                    if (stack.isEmpty()) {
                        return false;
                    }
                    char ch = stack.pop();
                    System.out.println("grabbing " + map.get(ch));
                    System.out.println("ch " + ch);

                    if(map.get(ch) != s.charAt(i) ) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
}

}
