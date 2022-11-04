public class BuddyStrings {
        public boolean buddyStrings(String s, String goal) {

            char [] res = swap(s);
            System.out.println("res -> " + res );
            for(char c : res) {
                System.out.println(c);
            }
            return false;
        }
        public char[] swap(String s)  {

            System.out.println(" ") ;
            int end = s.length()-1;
            int start = 0, N = s.length();
            char [] arr = s.toCharArray();

            while(end >= 0 && start < N) {
                char temp = arr[start];
                arr[start] = arr[end];
                temp = arr[end];
                end--;
                start++;
            }

            return arr;
        }
    }
