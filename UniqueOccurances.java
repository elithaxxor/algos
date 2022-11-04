import java.util.*;


public class UniqueOccurances {
        public boolean uniqueOccurrences(int[] arr) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int N = arr.length;
            int count = 0;
            for (int i : arr) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }

            Set<Integer> set = new HashSet<>(map.values());

            return map.size() == set.size();
        }
    }