public class findDuplicates {
        public int findDuplicate(int[] nums) {
            System.out.println(nums[0]);
            System.out.println(nums[nums[0]]);

            while (nums[0] != nums[nums[0]]) {
                int nxt = nums[nums[0]];
                nums[nums[0]] = nums[0];
                nums[0] = nxt;
            }
            return nums[0];
        }

    public static void main (String [] args ) {
            int [] arg = new int [] {1,3,4,2,2};

            findDuplicates f = new findDuplicates();
            int res = f.findDuplicate(arg);
            System.out.println(res);

    }
    }


