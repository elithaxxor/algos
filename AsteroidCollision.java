import java.util.LinkedList;
import java.util.*;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {

        int [] res = new int [asteroids.length];
        Queue<Integer> q  = new LinkedList<>();
        int fast = 1;
        for (int i = 0; i < asteroids.length && fast < asteroids.length; i++) {
            System.out.println(asteroids[i]);
            while (q.isEmpty() && asteroids[i] > 0 ) {
                //int size = Math.abs(asteroids[i]);
                q.offer(asteroids[i]);

                // mark- create loop that will break to reset queue order
                while (true) {
                    if (q.peek() > 0  &&  asteroids[fast] < 0) {
                        int rSize =  Math.abs(asteroids[fast]);
                        int lSize = Math.abs(q.peek());
                        if (lSize > rSize) {
                            q.remove();
                            q.add(asteroids[fast]);
                            fast++;
                        }
                        if (lSize == rSize ) {
                            q.remove();
                            fast++;
                        }
                    }
                    if (asteroids[fast] > 0 && q.peek() < Math.abs(asteroids[fast])) {
                        q.remove();
                    }
                    else {
                        q.add(asteroids[fast]);
                        break;
                    }
                }
            }

        }

        for(int i = 0; i < q.size(); i++) {
            System.out.println(q.peek());
        }
        return   res;

    }

    public static void main(String[] args) {
        int k = 0;
        int[] nums = new int[]{5, 10, -5};
        AsteroidCollision sa = new AsteroidCollision();
        int[] r = sa.asteroidCollision(nums);
        System.out.println(r);
    }

}
