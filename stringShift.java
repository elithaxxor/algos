public class stringShift {

        public String stringShiftI (String s, int[][] shift) {
            int end = s.length();
            int start = 0;

            StringBuilder sb = new StringBuilder();
            for (int[] move : shift) {
                int direction = move[0];
                int amount = move[1] % end;

                if(direction == 0 ) {
                    while (end >= start) {
                        end = end - amount;
                        sb.append(s.substring(end--));
                        System.out.println(sb.toString());
                    }
                }
                else {
                    while (start <= end) {
                        start = start + amount;
                        sb.append(s.substring(start++));
                        System.out.println(sb.toString());
                    }
                }
               // s = sb.substring(s.length());
            }

            return sb.toString().substring(0,s.length());
        }
    public static void main (String [] args ) {
        int [][] arg2 = new int [][] {{0,1}, {1,2}};
        String arg = "abc";

        stringShift f = new stringShift();
         String res = f.stringShiftI(arg, arg2);
         System.out.println("res -> " + res );

    }
}

