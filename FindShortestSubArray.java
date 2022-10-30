import java.util.HashMap;

public class FindShortestSubArray {
    public int findShortestSubArray(int[] nums) {

        int m = nums.length;
        int n = nums.length - 1;
        int maxDeg = 0;


        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            maxDeg = Math.max(maxDeg, map.get(i));
        }
        System.out.println(maxDeg);
        System.out.println(map);

        // mark- start window traversal
        HashMap<Integer, int[]> maxDegMap = new HashMap<>();
        int right = 0;

        while (right < nums.length) {
            if(map.containsKey(maxDeg)) {
                if(!maxDegMap.containsKey(maxDeg)) {
                    int [] len = new int [] {right, 0};
                    maxDegMap.put( nums[right], len);
                }
            }

            for(Integer i : maxDegMap.keySet()) {
                int [] maxLen = maxDegMap.get(i);

            }
        }



        return 0;
    }

    public static void main(String[] args) {
        int [] arg = new int[] {1, 1, 0, 9, 43, 43};
        FindShortestSubArray f = new FindShortestSubArray();
        int r = f.findShortestSubArray(arg);
        System.out.println(r);

    }

}