import java.util.Arrays;

public class ReOrderLogFilesII {
        public String[] reorderLogFiles(String[] logs) {

            Arrays.sort(logs, (log1, log2) -> {

                // mark seperate log files
                String [] l1 = splitLogs(log1);
                String [] l2 = splitLogs(log2);

                // mark check second half of log if num or alphabet
                boolean isNumeric1 = isNumeric(l1[1].charAt(0));
                boolean isNumeric2 = isNumeric(l2[1].charAt(0));

                if (isNumeri1) {

            }
            return res;
        }

        private String[] splitLogs(String log) {
            return log.split(" ", 2);
        }

        private boolean isNumeric(char ch) {
            return ch < '9' && ch > '0';
        }
    }
