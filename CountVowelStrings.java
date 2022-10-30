public class CountVowelStrings {
    public int countVowelStrings(int n) {

        return backtrack(n, 1);

    }

    public int backtrack(int n, int vowels) {
        if (n == 0 ) {
            return 1;
        }
        int sum = 0;

        for (int i = vowels; i <= 5; i++ ) {
            sum += backtrack(n-1, i);
        }
        return sum;
    }


    public static void main(String[] args) {
        CountVowelStrings run = new CountVowelStrings();
        int[] arg = new int[]{1};
        int i = 1;
        int r = run.countVowelStrings(i);
        System.out.println(r);

    }

}



