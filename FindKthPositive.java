//https://leetcode.com/problems/kth-missing-positive-number/

public class FindKthPositive {
        public int findKthPositive(int[] arr, int k) {

            int p1 = 0;
            int N = arr.length, count = 0;
            for(int p2 = 0; p2 < N; p2++ ){
                int missing = p2 - p1 ;
                if(missing != 1){
                    System.out.println("count");
                    count++;
                }
            }

            System.out.println("fin");
            return count;
        }
    }
}
