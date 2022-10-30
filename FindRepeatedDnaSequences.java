import java.util.*;

public class FindRepeatedDnaSequences {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new LinkedList<String>();

        int left = 0;
        int right = 0;
        HashSet<Character> set = new HashSet<>();
        HashMap<Character, Integer> map = new HashMap<>();

        int count = 0;
        int window = 0;

        for (int i = 0; i < s.length() && i + 1 < 10; i++) {
            String temp = s.substring(i, i+10);
            System.out.println(temp);
            while(left < temp.length() && set.contains(s.charAt(i))) {
                System.out.println("new window " + s.charAt(left));
                res.add(temp);
                left++;
            }
            set.add(temp.charAt(i));
        }
        System.out.println(set);
        System.out.println(res);
        System.out.println(map);

        return res;
    }

    public static void main(String[] args) {
        String arg = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        FindRepeatedDnaSequences run = new FindRepeatedDnaSequences();
        run.findRepeatedDnaSequences(arg);
    }
}