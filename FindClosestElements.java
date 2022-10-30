import java.util.*;

public class FindClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new LinkedList<>();

        int N = arr.length;
        int left = 0; int right = N - k;
        while (left < right) {
            int mid = left + (right - left )/2;

            right++;
            left++;

        }
        return res;

    }

    public static void main(String[] args) {

        FindClosestElements run = new FindClosestElements();
        int[] arg = new int[]{3,2,1,1,4,4};
        int k = 3;  int x = 4;
        run.findClosestElements(arg,k,x);
        System.out.println("res -> "
        );
    }

    }
