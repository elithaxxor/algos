// https://leetcode.com/problems/reorder-data-in-log-files/
// https://www.youtube.com/watch?v=UbNU98fKV8o&list=PL1MJrDFRFiKZJ5q5ddQYHbAlfReUx1muX&index=3

import java.util.Arrays;

public class ReorderLogFiles {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (log1, log2)  -> {

            // mark: Identifier from logs
            String[] arr1 = splitString(log1);
            String[] arr2 = splitString(log2);

            System.out.println("arr1 "  + arr1[1].charAt(0));
            System.out.println("arr2 "  + arr2[1].charAt(0));

            // mark: check if arrs are numbers
            boolean isNum1 = isNum(arr1[1].charAt(0));
            boolean isNum2 = isNum(arr2[1].charAt(0));
            if (isNum1 && isNum2) {return 0; }
            else if (isNum1) {return 1;}
            else if (isNum2) {return -1;}

            // mark: checks if same lexigraphically
            boolean isSameContent = arr1[1].equals(arr2[1]);
            if(isSameContent) return arr1[0].compareTo(arr2 [0]);
            return arr1[1].compareTo(arr2[1]);

        });
        return logs;

    }

    private String[] splitString(String string) {

        return string.split(" ", 2);
    }
    private boolean isNum(char ch) {
        return '0' <= ch && ch <= '9';
    }

    public static void main(String[] args) {
        String[] logs = new String[]{"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        ReorderLogFiles ro = new ReorderLogFiles();
        ro.reorderLogFiles(logs);
    }

}
