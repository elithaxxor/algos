import java.util.*;

public class SortPeople {

    public String[] sortPeople(String[] names, int[] heights) {

        HashMap <String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder(heights.length);
        String[] res = new String[heights.length];
        for (int i = 0; i < heights.length; i++) {
            map.put(names[i], heights[i]);
        }
        System.out.println(map);

        Arrays.sort(heights);
        for (int i = 0; i < heights.length; i++) {
            map.get(names[i]);
        }
        return res;

    }


    public String[] sortPeopleII(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }

        Arrays.sort(heights);
        String[] result = new String[heights.length];

        int index = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            result[index] = map.get(heights[i]);
            index++;
        }
        return result;
    }
}
