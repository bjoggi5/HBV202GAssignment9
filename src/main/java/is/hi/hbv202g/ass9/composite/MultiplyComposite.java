package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression {

    private List<MathExpression> children = new ArrayList<>();

    public MultiplyComposite() {

    }

    public int getResult() {
        if (children.size() == 1) {
            return children.get(0).getResult();
        } else {
            int result = 1;
            for (MathExpression child : children) {
                result *= child.getResult();
            }
            return result;
        }
    }

    public void add(MathExpression expression) {
        this.children.add(expression);
    }
}
