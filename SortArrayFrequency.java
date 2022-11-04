import java.util.*;

public class SortArrayFrequency {
        public int[] frequencySort(int[] nums) {
            int N = nums.length;
            int [] res = new int[N];
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

            int count = 0, max = 0;

            for(int i: nums) {
                map.put(i, map.getOrDefault(i, 0)+1);
                res[count] = map.get(i);
                count++;

            }
            System.out.println("map - > " + map);
            int curr = 0;
            for(int i = 1; i < N; i++) {

                if(res[curr] < res[i]) {
                    swap(nums, curr, i);
                }
                reverse(nums, 0, n-1);
                curr++;
            }

            for(Integer entry : map.keySet()) {
                System.out.println(entry + " -> " + map.get(entry));
            }

            return res;
        }
        public void swap(int[] arr, int curr, int next) {
            int temp = arr[curr];
            arr[curr] = arr[next];
            arr[next] = temp;
        }

        public void reverse  ( int [] arr, int start, int end) {
            while (start < end) {
                reverse(arr, start, end);
                start ++;
                end--;
            }
        }
    }


