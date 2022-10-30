import java.util.HashMap;
import java.util.Map;

public class MostFrequentEvenII {
    public int mostFrequentEven(int[] nums) {
        int N = nums.length;
        int [] freq = new int [100001];

        for (int i : nums) {
            freq[i]++;
        }

        int res = -1; int maxFreq = 0;
        for(int i = 0; i < nums.length; i++) {
            int key = nums[i] % 2;

            if(key == 0 && freq[i] > maxFreq) {
                maxFreq = freq[i];
                res = i;
            }
        }

        return res;
    }




    public static void main(String[] args) {

        MostFrequentEvenII mf = new MostFrequentEvenII();
        int[]input = new int[]{2,2,2,3,4,5,3,3};
        int r = mf.mostFrequentEven(input);
      //  System.out.println(r);

    }

    }
