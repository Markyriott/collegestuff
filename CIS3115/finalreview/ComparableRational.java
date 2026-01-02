class ComparableRational extends Rational implements Comparable<ComparableRational>{
    public void ComparableRational(){
        super(0,1);
    }

    public void ComparableRational(long numerator, long denominator){
        super(numerator, denominator);
    }

    @Override
    public int compareTo(ComparableRational o){
        long p1 = getNumerator()*o.getDenominator();
        long p2 = getDenominator()*o.getNumerator();
        if(p1>p2)
            return 1;
        else if (p1 == p2)
            return 0;
        else return -1;
    }
}
