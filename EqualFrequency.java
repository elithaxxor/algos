import java.util.List;
// https://leetcode.com/problems/remove-letter-to-equalize-frequency/
public class EqualFrequency {

    public boolean equalFrequency(String word) {

        int [] freq = new int [26];
        int count=0;
        for(char c : word.toCharArray()) {
            freq[c - 'a']++;
            System.out.println(freq[count]);
            count++;
        }


        for (int i = 0; i < 26; i++) {
            freq[i]--;
            System.out.println("freq dec " + freq[i]--);
            if (equalFrequency(freq)) {
                return true;
            }
            System.out.println("freq inc " + freq[i]--);
            freq[i]++;
        }

        return false;
    }

    public boolean equalFrequency(int [] freqMap) {
        int freq = 0;
        for (int i : freqMap) {
            if (i == 0 || freq == i) {
                continue;
            } else if (freq == 0 ) {
                freq = i;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        EqualFrequency ip = new EqualFrequency();
        String arg = "abcc";
        boolean r = ip.equalFrequency(arg);
        System.out.println("res -> " + r);
    }
}

