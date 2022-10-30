import java.util.Arrays;

public class JavaString {
        public String decodeString(String s) {

            String[] split = s.split("]");

            int count = 0;
            StringBuilder alphabet = new StringBuilder();
            StringBuilder sb = new StringBuilder();

            for ( int i = 0; i < s.length() ; i++ ) {

                String str = s.substring(i);
                System.out.println("current string " + str);

                boolean flag = true;
                while (flag) {
                         if (Character.isDigit(str.charAt(count))) {
                             Character charDig = str.charAt(count);
                             int digit = Integer.parseInt(charDig.toString());
                             System.out.println("found -- digit " + digit);
                             count++;
                             System.out.println("mext char - > " + str.charAt(count));
                             if (!Character.isAlphabetic(str.charAt(count))) {
                                 count++;
                             }
                             alphabet.append(str.charAt(count));
                             System.out.println("found alphabet " + alphabet.toString());
                             int sbCount = 0;
                             for (int j = 0; j < digit; j++) {
                                 System.out.println("Inserting -> " + alphabet.toString());
                                 // sb.insert(sbCount, alphabet.toString());
                                 sb.append(alphabet);
                                 System.out.println("mutated sB "+ sb.toString());
                                 sbCount++;
                             }
                             break;
                         }
                    count++;
                }
            }
            return sb.toString();
        }
        public static void main (String [] args ) {
            JavaString work = new JavaString();
            String fuck  = "3[a]2[bc]" ;
            work.decodeString(fuck);
        }
    }



