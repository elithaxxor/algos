class Solution {
    public void sortColors(int[] nums) {
        int N = nums.length;
        int L = 0, R = N-1;
        int curr = 0;

        while(curr <= R) {
            if(nums[curr] == 2) {
                swap(nums, curr, R);
                R--;

            }
            else if (nums[curr] == 1) {
                curr++;
            } else {
                swap(nums, curr, L);
                L++;
                curr++;
            }

        }
    }

    public void swap (int [] nums, int i, int j) {
        int temp = nums[i];
        nums[i]  = nums[j];
        nums[j] = temp;
    }
}
