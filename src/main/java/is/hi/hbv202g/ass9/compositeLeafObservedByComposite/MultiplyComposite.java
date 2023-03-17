package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite extends Observable implements MathExpression, Observer {

    private List<MathExpression> children = new ArrayList<>();

    private int lastObservedResult;

    public MultiplyComposite() {
        lastObservedResult = 0;
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

    @Override
    public void update() {
        lastObservedResult = this.getResult();
        System.out.println("MultiplyComposite: " + lastObservedResult);
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }
}
