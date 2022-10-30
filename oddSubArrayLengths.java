import java.util.Arrays;

public class oddSubArrayLengths {

        public int sumOddLengthSubarrays(int[] arr) {
            int sum = 0;
            int left=0;
            int right = 0;
            int count = 0;
            int carry = 0;
            Arrays.sort(arr);
            while (left < arr.length) {
                carry += arr[left] % 2;
                sum += arr[left];
                System.out.println(sum);
                while (carry == 1 && right < arr.length ) {
                    sum += arr[left] + arr[right++];
                    System.out.println("odd sums " + sum);
                    count++;
                }
                left = left+2;
                right--;
            }
            return sum;
        }


    public int sumOddLengthSubarraysII(int[] arr) {
            int sum = 0;
            int window = 1 ;

            int end = arr.length;
            while (window < end) {
                for(int i = 0; i < arr.length - window; i++) {
                    for (int j = i; j < i + window; j++) {
                        sum += arr[j];
                    }
                }
                window+=2;
            }
            return sum;
    }


        public static void main (String [] args ) {
        oddSubArrayLengths work = new oddSubArrayLengths();
        oddSubArrayLengths work2 = new oddSubArrayLengths();


        int [] fuck  = {1,4,2,5,3};
        int res = work.sumOddLengthSubarrays(fuck);
        int res2 = work2.sumOddLengthSubarrays(fuck);
        System.out.println("res -> " + res);
        System.out.println("res2 -> " + res2);
    }
}

//
//class Solution {
//    public int sumOddLengthSubarrays(int[] arr) {
//
//        int win=1,ans=0;
//        while(win<=arr.length){
//            for(int i=0;i<=arr.length-win;i++){
//                for(int j = i; j< i + win; j++){
//                    ans+=arr[j];
//                }
//            }
//            win+=2;
//        }
//        return ans;
//    }
//}
