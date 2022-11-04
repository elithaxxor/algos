public class Codec {

    private char del = '#';
    private int amount;
    private String encoded;


    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        int N = strs.size();
        int length=0;
        StringBuilder encode = new StringBuilder();

        System.out.println(encode);
        for(int i = 0; i < N; i++) {
            String str = strs.get(i);
            length = str.length();
            encode.append(del);
            encode.append(length);
            encode.append(str);

        }
        System.out.println(encode.toString());
        return encode.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<Character> res = new ArrayList<>();
        List<String> res2 = new ArrayList<>();

        int N = s.length();

        int count = 0;
        //int range = 0;
        for (char c : s.toCharArray()) {
            if (c == del) {
                continue;
            }
            count++;

            StringBuilder sb = new StringBuilder();
            if (Character.isDigit(c)) {
                int range = Integer.parseInt(String.valueOf(c));
                System.out.println("range " +range);
                System.out.println("ch " + c );
                System.out.println("count " + count);

            }

        }



        /// System.out.println("res -> " + res );
        return res2;
    }
}
