// https://leetcode.com/problems/next-permutation/

public class NextPermutation {
    public void nextPermutation(int[] nums) {

        // mark: set up date for Array back traverssal
         int N = nums.length;
         int curr = N-2;
         int next = N;

         // mark: if curr position is
        // 1- find elments tso reolace
         while (0 <= curr) {


             if(nums [curr] < nums[next]) {
                break;
             }
                 curr--;
                 next--;
         }


        // mark : find replace index
         if(0 <= curr) {
             int replaceCurr = N -1;
            while (replaceCurr > 0 ) {
                if (nums[curr] < nums[replaceCurr]) { break ;}
                swap(nums, replaceCurr, curr);
            }

            reverse(nums, next, N-1);
         }

    }

    private void swap(int[] nums, int curr, int c) {

            int temp = nums[curr];
            nums[curr] = nums[c];
            nums[c] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;

        }

    }
}
