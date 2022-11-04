import java.util.*;

public class CheckIfPangram {
        public boolean checkIfPangram(String sentence) {

            Map<Character, Boolean> map = new HashMap<>();
            char [] alphabet = new char [] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            for(char c : alphabet) {
                map.put(c, false);
            }

            for(char c : sentence.toCharArray()) {
                if(map.containsKey(c)){
                    map.put(c, true);
                } else {
                    map.putIfAbsent(c, true);
                }
            }
            System.out.println(map);
            System.out.println("does contain key? \n\n" + map.containsValue(false));

            if( map.containsValue(false)) { return false; }
            return true;
        }
    }

