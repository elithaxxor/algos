public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int N = nums.length;
        int p1 = 0;
        int p2 = 0;
        int max = 0;
        int count = 0;


        for (int i : nums){

            if(i == 1) {
                count++;
                max = Math.max(max, count);
                System.out.println("count " + count );
            }
            if ( i == 0 ) { count = 0; }
        }

        return max;
    }
}

