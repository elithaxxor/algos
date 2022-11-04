public class NextPurmtationII {
        public void nextPermutation(int[] nums) {
            int N = nums.length;
            int left = N - 2;
            int right = N - 1;
            int total = 0;

            // mark: find what needs to be replaced
            while(left >= 0) {
                if(nums[left] < nums[right]) { break; }
                left--;
                right--;
            }
            System.out.println("swap -> " + left + "next -> " + right );


        }
    }


}
