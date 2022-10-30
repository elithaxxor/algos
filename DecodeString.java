import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DecodeString {

    Queue <Character> q = new LinkedList<>();

    public String decodeString(String s) {

       int  j = 1;
       String res = "\0";
       StringBuilder sb = new StringBuilder();
      // Queue<Character> q = new LinkedList<>();

       q.add(' ');
        int digit=0;
       int count = 0;
        for(int i = 0;  i < s.length() && j <= s.length(); j++, i++) {
            char alphabet ='\0';

            char ch = s.charAt(i);

            // how many chars to add
            if(Character.isDigit(ch)) {
                String str = String.valueOf(ch);
                digit = Integer.parseInt(str);
             ///   System.out.println("digit -> " +digit);

            }
            // the chars to add
            if(Character.isAlphabetic(s.charAt(i))) {
                alphabet = s.charAt(i);
                System.out.println("alphabet -> " +alphabet);
                addStack(digit, alphabet);

            }

        }

        System.out.println("stack  -> " +  q.toString());
        return q.toString();
    }

    public void addStack (int digit, char alphabet) {
        System.out.print("adding to stack " + alphabet + " : " + digit);
        for(int i = digit; i >= 0; i--) {
            System.out.println("looped alpbet -> " +alphabet);
            q.add(alphabet);
            digit--;
        }
    }

    public static void main(String[] args) {

        String s = "3[a]2[bc]";
        DecodeString run = new DecodeString();
        String res = run.decodeString(s);
        System.out.println("res -> " +res);
    }
}
