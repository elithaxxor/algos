public class SubArraySumI {
    public int subarraySum(int[] nums, int k) {
        int count =0;
        for (int i = 0; i < nums.length; i++ ) {
            for(int j = i +1; j <= nums.length; j++) {

                int sum = 0;
                for (int ij = i; ij < j; ij++ ) {
                    sum+= nums[ij];

                    if (sum == k) {
                        System.out.println(sum);
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int k = 0;
        int [] nums = new int [] { 1, 5, 2, 4, 2 };
        SubArraySumI sa = new SubArraySumI();
        int r = sa.subarraySum(nums, k );
        System.out.println(r);

    }
    }
