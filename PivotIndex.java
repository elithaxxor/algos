
// https://leetcode.com/problems/find-pivot-index/

public class PivotIndex {
    public int pivotIndex(int[] nums) {

        int N = nums.length;
        int sum = 0;
        for (int i : nums) {
            sum+=i;
        }

        int rS = sum;
        int lS = 0;

        for(int idx = 0 ; idx < nums.length; idx++) {
            rS -= nums[idx];
            if (rS == lS ) {
                return idx;
            }
            lS += nums[idx];
        }

        return -1;
    }

    public static void main(String[] args) {
        PivotIndex ip = new PivotIndex();
        int[] arg = new int []{1,2,3,4,5};
        int r = ip.pivotIndex(arg);
        System.out.println("res -> " + r);
    }
}
