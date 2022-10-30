import java.util.*;

public class DailyTemperatures {
        public int[] dailyTemperatures(int[] temperatures) {

            Stack<Integer> stack = new Stack<>();
            int [] res = new int [temperatures.length];
            for (int i = 0; i < temperatures.length; i++) {
                while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i] ) {
                    res[stack.peek()] = i - stack.peek();
                    stack.pop();
                }
                stack.push(i);
                System.out.println("stack peak \n" +temperatures[stack.peek()]);

            }
            return res;
        }

            public int[] dailyTemperaturesII(int[] temperatures) {
                int n = temperatures.length;
                int [] res = new int [n];

                for (int i = 0; i < n; i++) {
                    for (int j = i+1; j < n; j++) {
                        if (temperatures[j] > temperatures[i]) {
                            res[i] = j-i;
                            break;
                        }

                    }

                }
                return res;
            }

            public int[] dailyTemperaturesIII(int[] temperatures) {
                Deque<Integer> stack = new ArrayDeque<>();

                int[] res = new int[temperatures.length];
                for (int i = 0; i < temperatures.length; i++) {

                    int curr = temperatures[i];

                    while(!stack.isEmpty() &&  temperatures[stack.peek()] < curr) {
                        int prev = stack.pop();
                        res[prev] =  i - prev;
                    }
                    stack.push(i);
                }
                return res;

            }


    public static void main (String [] args ) {
        int [] arg2 = new int [] {73,74,75,71,69,72,76,73};
        String arg = "abc";

        DailyTemperatures a = new DailyTemperatures();
         a.dailyTemperatures(arg2);
        //System.out.println("res -> " + res );

    }
}


