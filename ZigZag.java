// https://www.youtube.com/watch?v=pEku6cp_J80&list=PL1MJrDFRFiKaqGdb3lM27Bqk5EKpVm2-r&index=7
// https://leetcode.com/problems/zigzag-conversion/

// note, when traversing a collection, use a while loop and nest for loops inside.

public class ZigZag {
    public String convert(String s, int numRows) {

        // mark: build stringbuilder[]
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i =0;  i < numRows; i++) {
            sb[i] = new StringBuilder();
        }; System.out.println("built stringbuilder  len " + sb.length);

        // mark: build data
        int N = s.length();
        int M = s.length() -1;
        char [] charArr = s.toCharArray();

        // mark: start traversal
        int idx = 0;
        while (idx < N) {
            // mark: [down]
            for (int i = numRows; i < N && idx < N ; i++) { // mark:down
                sb[i].append(charArr[idx]);
                idx++;
            }
                for (int j = 2; j < N - 1 && idx < N ; j--) { // mark: [upward]
                    sb[j].append(charArr[idx]);
                    idx++;
            }

        }

        // mark: combine stringbuilder into one.
        StringBuilder res = sb[0];
        for (int i = 1; i <numRows; i++) { //
            res.append(sb[i].toString());
        }
        return res.toString();

    }

    public static void main(String[] args) {

        String s = "PAYPALISHIRING";
        int numRows = 3;
        ZigZag zz = new ZigZag();
        String r = zz.convert(s, numRows);

        System.out.println();
    }
}