import java.util.*;

public class CountVowelSubstringsII {
    public int countVowelSubstrings(String word) {
        String [] vowels = new String[]{"aeiou"};
        Hashtable<Character, Boolean> map = new Hashtable<>();
        int res = 0;
        int right  = 0;

        while (right <= word.length()) {

            String currVowel = vowels[right];
            char ch = currVowel.charAt(right);
            System.out.println(currVowel);

            if(!map.getOrDefault(ch, true)) {
                map.put(word.charAt(right), true);
                right++;
            }
            map.put(word.charAt(right), false);

            right++;
        }


        System.out.println(map);

        return res;
    }

    public static void main (String [] args ) {
        int [][] arg = new int [][] {{0,1}, {1,2}};
        String arg2 = "aeiouu";
        CountVowelSubstringsII f = new CountVowelSubstringsII();
        int res = f.countVowelSubstrings(arg2);
        System.out.println("res -> " + res);

    }

}
