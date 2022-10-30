public class CalculateTaxes {

    public double calculateTax(int[][] brackets, int income) {

        double res = 0;
        int prev = 0;
        for (int[] bracket : brackets) {
            int upper = bracket[0], percent = bracket[1];
            if (income >= upper) {
                res += (upper - prev) * percent / 100d;
                prev = upper;
            } else {
                res += (income - prev) * percent / 100d;
                return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        CalculateTaxes ip = new CalculateTaxes();
        int [][] arg = new int[] []{{1, 1, 0}, {1,0,1},{0,0,0}};

        double r = ip.calculateTax(arg, 10);
        System.out.println("RES ->" + r);
    }
}


