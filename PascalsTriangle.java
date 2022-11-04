import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle/
// https://www.youtube.com/watch?v=XhppEP4OPHQ

// pascals triangle
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {

        // [MARK] - START TRIANGLE BUILD

        List<List<Integer>> triangle = new ArrayList<>();
        if ( numRows == 0) { return triangle; }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1); // mark: build first row for trangle
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) { // mark : builds triangle, starting at 2nd row
            List <Integer> Row = new LinkedList<>();
            List <Integer> prevRow =  triangle.get(i-1);

            Row.add(1); // mark: satisfies left triangle
            for (int j = 1; j < i; j++ ) {  // mark: build middle (each # is sum of two directly above it)
                int val =  prevRow.get(j - 1) + prevRow.get(j);
                Row.add(val);
            }
            Row.add(1); // mark: satasfies right triangle
            triangle.add(Row);
         //   firstRow = Row; // mark: set pre to current sub
        }

        System.out.println(triangle.size());
        return triangle;
    }


    public static void main(String[] args) {
        PascalsTriangle ip = new PascalsTriangle();
        int arg2 = 3;
        List<List<Integer>> r = ip.generate(arg2);
        System.out.println("res -> " + r);
    }
}
