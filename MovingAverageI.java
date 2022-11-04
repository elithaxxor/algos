class MovingAverage {
    int size;
    List q = new ArrayList<Integer> ();

    public MovingAverage(int size) {
        this.size = size;

    }

    public double next(int val) {
        q.add(val);
        int sum = 0;
        int left = Math.max(0, q.size() - size);

        System.out.println(left);

        for(int i = left; i < q.size(); i++) {
            sum+= (int) q.get(i);
        }
        int right = Math.min(q.size(), size);
        return 1.0*sum/right;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */