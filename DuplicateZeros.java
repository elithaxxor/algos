// https://leetcode.com/problems/duplicate-zeros/

import java.util.*;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {

        int N = arr.length;
        Queue <Integer> q = new LinkedList<>();
        Stack <Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            if (arr[i] == 0) {
                q.add(0);
                q.add(0);
            }
            else {
                q.add(arr[i]);
            }
            Integer first = q.poll();
            arr[i] = first;
        }
        System.out.println("q -> " + q);

    }
    public static void main(String[] args) {
        DuplicateZeros ip = new DuplicateZeros();
        int[] arg = new int [] {1,0,2,3,0,4,5,0};
         ip.duplicateZeros(arg);
    }
}
