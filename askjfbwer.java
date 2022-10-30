//import java.util.Arrays;
//
//class Solution {
//    public String shortestCompletingWord(String licensePlate, String[] words) {
//
//        HashMap<Character, Integer> map = new HashMap<>();
//        HashMap <Character, Integer> map2 = new HashMap<>();
//
//
//        // Format strings
//        String word = Arrays.toString(words).toLowerCase();
//        String plate = licensePlate.toString().toLowerCase();
//
//        StringBuilder sb = new StringBuilder();
//
//        for (char c : word.toCharArray()) {
//            map.put(c , map.getOrDefault(c, 0)+1);
//        }
//        for (char c : plate.toCharArray()) {
//
//            if (map.containsKey(c)) {
//                sb.append(c);
//            }
//            map2.put(c, map2.getOrDefault(c, 0)+1);
//        }
//
//        System.out.println("word " + word);
//        System.out.println("\n\nplate " + plate);
//        System.out.println("map -> " + map);
//        System.out.println("map2 -> " + map2);
//        System.out.println("\n\nString -> " + sb.toString());
//
//
//
//        for (String str : words)
//            return sb.toString();
//    }
//
//}
//
//
//class Solution {
//    public String shortestCompletingWord(String licensePlate, String[] words) {
//
//        HashMap<Character, Integer> map = new HashMap<>();
//        HashMap <Character, Integer> map2 = new HashMap<>();
//
//
//        // Format strings
//        String word = Arrays.toString(words).toLowerCase();
//        String plate = licensePlate.toString().toLowerCase();
//
//        StringBuilder sb = new StringBuilder();
//
//        for (char c : word.toCharArray()) {
//            map.put(c , map.getOrDefault(c, 0)+1);
//        }
//        for (char c : plate.toCharArray()) {
//
//            if (map.containsKey(c)) {
//                sb.append(c);
//            }
//            map2.put(c, map2.getOrDefault(c, 0)+1);
//        }
//
//        System.out.println("word " + word);
//        System.out.println("\n\nplate " + plate);
//        System.out.println("map -> " + map);
//        System.out.println("map2 -> " + map2);
//        System.out.println("\n\nString -> " + sb.toString());
//
//
//        for (String str : words) {
//        }
//            return sb.toString();
//    }
//
//}
