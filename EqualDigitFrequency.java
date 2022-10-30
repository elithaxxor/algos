import java.util.HashMap;
import java.util.LinkedHashSet;

public class EqualDigitFrequency {
    public int equalDigitFrequency(String s) {

        StringBuilder sb [] = new StringBuilder[s.length()];
        int res = 0; int maxDegree = 0;
        int N = s.length();
        int left = 0 ; int right = 0 ;
        HashMap <Character, Integer> map = new HashMap<>();
        LinkedHashSet<Character> set = new LinkedHashSet<>();


        for ( int i = 0; i < s.length(); i++ ) {
           map.put(s.charAt(i), i);
            char ch = s.charAt(i);
            set.add(ch);
             maxDegree = Math.max(maxDegree, i);

            System.out.println(ch);

        }
        System.out.println("map " + map);
        System.out.println("set " + set);
        System.out.println("max degree "  +maxDegree);
        for (int i : s.toCharArray()) {
            System.out.println("i -> " +  i );

        }
        while (right < N) {
            right++;
        }

//        if (set.size() % 2 == 0 ) {
//            return set.size() *set.size() +1;
//        }
        return maxDegree + set.size();
    }
    public static void main(String[] args) {

        String s = "12321";
        EqualDigitFrequency run = new EqualDigitFrequency();
        int r = run.equalDigitFrequency(s);
        System.out.println("r -> " + r);

    }
}
