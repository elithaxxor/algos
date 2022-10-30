import java.util.*;

public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        char [] ss =s.toCharArray();
        char [] st = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(st);

        int count = 0;
        //int count = 0;
        char res;


        while (count < s.length()) {
            if(ss[count] != st[count]) {
                System.out.print("found differnt char, ");
                return st[count];
            }
            count++;
        }
        return st[count];
    }

    public char findTheDifferenceII(String s, String t) {

        HashMap <Character, Integer> map = new HashMap<>();
        char res;
        char extraChar = '\0';

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        System.out.println("map "  + map );

        char r = '\0';
        for (int i = 0; i < t.length(); i++) {

            char c = t.charAt(i);
            int charCount = map.getOrDefault(t.charAt(i), 0);

             if (charCount != 1) {
                 r = c;
                 map.put(t.charAt(i), charCount -1);
                 continue;
             }

        }
        return r;
    }
}
