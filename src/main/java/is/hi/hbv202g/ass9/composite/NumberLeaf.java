package is.hi.hbv202g.ass9.composite;

public class NumberLeaf implements MathExpression {

    private int number;

    public NumberLeaf() {
        this.number = 0;
    }

    public NumberLeaf(int number) {
        this.number = number;
    }

    public int getResult() {
        return number;
    }
}
