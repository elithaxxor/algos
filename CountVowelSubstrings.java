import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountVowelSubstrings {
    public int countVowelSubstrings(String word) {
        String Vowels = "aeiou";
        HashMap <Character, Boolean> map = new HashMap<>();
        int res = 0;
        int right  = 0;


        for (int i = 0; i < word.length() && right < word.length(); i++) {
            if(!map.containsValue(map.get(word.charAt(i))) || !map.containsValue(map.get(word.charAt(right)))){
                System.out.println("contains value ");
                int k  = right - i;
                res += right - i;

                map.put(word.charAt(i), false);
                System.out.println("window " + k );
                System.out.println("res " + res );

                if (res == 5) {
                    k++;
                    right++;
                }
            }
            map.put(word.charAt(right), true);
            right++;

        }

        System.out.println(map);
        return res;
    }

    public static void main (String [] args ) {
        int [][] arg = new int [][] {{0,1}, {1,2}};
        String arg2 = "aeiouu";
        CountVowelSubstrings f = new CountVowelSubstrings();
        int res = f.countVowelSubstrings(arg2);
        System.out.println("res -> " + res);

    }
}

