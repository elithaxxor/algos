public class ShuffleArray {
        public int[] shuffle(int[] nums, int n) {
            int K = nums.length;
            int pos = n;
            int [] res = new int [K];

            for (int i = 0; i < n; i++) {
                res[2*i] = nums[i];
                res[2*i+1] = nums[i+n];
            }
            return res;
        }
    }