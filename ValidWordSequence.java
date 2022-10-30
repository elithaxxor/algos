import java.util.ArrayList;
import java.util.List;

public class ValidWordSequence {

    int [] res;
    static class validWordSequence {
        class Solution {

            public boolean validWordSquare(List<String> words) {

                int [] res = new int [words.size()];
                if (words.size() <= 0 || words == null) { return true; }
                int N  = words.size();

                for (int i = 0; i < N; i++) {
                    for(int j=0; j<words.get(i).length(); j++){


                        if(j >= N || words.get(j).length() <= i || words.get(j).charAt(i) != words.get(i).charAt(j))
                        {
                            System.out.println("does not equal");
                            return false;
                        }
                    }
                }
                return true;

            }
        }

    public static void main (String [] args ) {
        int [][] arg2 = new int [][] {{0,1}, {1,2}};


        String arg = "abc";

        stringShift f = new stringShift();


    }
}



}
