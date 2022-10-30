import java.util.*;

public class ArrayRankTransform {
    public int[] arrayRankTransform(int[] arr) {

        int N = arr.length;
        int K = arr.length - 1;
        int [] dummy = Arrays.copyOf(arr, K);

        HashMap<Integer, Integer> map = new HashMap<>();
        Hashtable <Integer, Integer> map2 = new Hashtable<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            map2.put(arr[i], map2.getOrDefault(arr[i], 0)+1);
        }

        System.out.println(map);
        System.out.println(map2);


        return dummy;
    }
    }
