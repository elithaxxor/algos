import java.util.*;

public class CommonChars {
    public List<String> commonChars(String[] words) {

        List<String> res = new LinkedList<>();
        char c = '\0';
        int count = 0;
        int K = words.length;
        int Kn = words[0].length();

        int[] masterFreq = new int[26];
        for (int i = 0; i < Kn; i++) {
            masterFreq[words[0].charAt(i) - 'a']++; // MARK; 0 denotes  common frequency
        }

        System.out.println("L 1" +  masterFreq.length);
        for (int i = 1; i < K; i++) {
            int[] childFreq = new int[26];

            for (int j = 0; j < words[i].length(); j++) {    // mark: traverse current word, update freq-array
                childFreq[words[i].charAt(j) - 'a']++;
            }

            for (int j = 0; j < 26; j++) {             // mark: traverse master freq and check if common characters
                if (childFreq[j] < masterFreq[j]) {
                    masterFreq[j] = childFreq[j];
                }
            }
        }

        // converts ascii back to char val
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < masterFreq[i]; i++) {
                res.add(Character.toString((char) ('a' + i)));
                System.out.println(Character.toString((char) ('a' + i))); // maps ascii back to char val
            }
        }
        return res;
    }

    public static void main(String[] args) {
        CommonChars ip = new CommonChars();
        String [] arg = new String [] {"bella","label","roller"};
        List res = ip.commonChars(arg);
        System.out.println("res -> " + res.toString());
    }
}

