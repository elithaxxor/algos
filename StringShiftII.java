public class StringShiftII {

    public String stringShift(String s, int[][] shift) {

        String res = "";
        StringBuilder sb = new StringBuilder();

        System.out.println(s);
        int count = 0;
        int N = s.length();

        for (int [] i : shift) {
            int direction = i[0];
            int amount = i[1];

            // left shift
            if (direction == 0 ) {
                s = s.substring(amount) + s.substring(0 , amount);
            } else {
                s = s.substring(N - amount) + s.substring(0, N-amount);
            }
        }


        return res;

    }

    public static void main(String[] args) {

        String s = "abc";
        int [][] shift = {{0, 1}, {1, 2}};
        StringShiftII run =  new StringShiftII();
        String res= run.stringShift(s, shift);
        System.out.println(res);

    }

    }
