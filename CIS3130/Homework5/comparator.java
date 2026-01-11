public record Interval1D(double min, double max) {
    public Interval1D {
        if (min > max) {
            throw new IllegalArgumentException("min > max");
        }
    }

    public double length() {
        return max - min;
    }

    public boolean contains(double x) {
        return min <= x && x <= max;
    }

    public boolean contains(Interval1D other) {
        return this.min <= other.min && other.max <= this.max;
    }

    public boolean intersects(Interval1D other) {
        return this.min <= other.max && this.max >= other.min;
    }

    @Override public String toString() {
        return "[" + min + ", " + max + "]";
    }

    Comparator<Interval1D> byLength = new Comparator<>(){
        @Override
        public int compare(Interval1D i1, Interval1D i2){
            return Double.compare(i1.length(), i2.length());
        }
    };

    Comparator<Interval1D> byMinThenMax = new Comparator<>(){
        @Override
        public int compare(Interval1D i1, Interval1D i2){
            if (i1.min != i2.min){
                return (int) Double.compare(i1.min, i2.min);
            } else{
                return (int) Double.compare(i1.max, i2.max);
            }
        }
    };

    Comparator<Interval1D> byMaxThenMin = new Comparator<>(){
        @Override
        public int compare(Interval1D i1, Interval1D i2){
            if (i1.max != i2.max){
                return (int) Double.compare(i1.max, i2.max);
            } else{
                return (int) Double.compare(i1.min, i2.min);
            }
        }
    };


    // Prof solution:
    Comparator<Interval> byMin = new Comparator<>() {
        @Override
        public int compare(Interval i1, Interval i2) {
            return Double.compare(i1.min(), i2.min());
        }
    };

    Comparator<Interval> byMax = new Comparator<>() {
        @Override
        public int compare(Interval i1, Interval i2) {
            return Double.compare(i1.max(), i2.max());
        }
    };

    Comparator<Interval> myMinThenByMax = byMin.thenComparing(byMax);

    Comparator<Interval> byMaxThenByMin = byMax.thenComparing(byMin);
}
