import java.util.*;
//https://www.youtube.com/watch?v=EUk1oibBmx0&list=PL1MJrDFRFiKa6ujcwZcMB8DdNzUg29BXy&index=7
// https://leetcode.com/problems/partition-labels/

public class PartitionLabel {
    public List<Integer> partitionLabels(String s) {

        List<Integer> res = new LinkedList<Integer>();
        // mark : caches last appearch of each charicter.
        char [] chars = s.toCharArray();
        int [] freq = new int[128];
        for(int i = 0; i < chars.length; i++ ) {
            char curr = chars[i];
            freq[curr] = i;
            System.out.println("CURR -> " + curr);
            System.out.println("CACHE -> " + freq[curr]);

        }

        // mark: create inner partition, and iterate
        int L=0, R=0, idx=0;
        while (idx < s.length())
        {
            char curr = chars[idx];
            R = Math.max(R, freq[curr]);
            if (R == idx) {
                int window = R-L+1;
                res.add(window);
                R++;
                L=R;
            }

            idx++;
        }

        return res;

    }
}
