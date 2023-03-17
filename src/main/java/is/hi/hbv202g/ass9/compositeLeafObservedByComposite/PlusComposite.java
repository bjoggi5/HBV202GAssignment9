package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite extends Observable implements MathExpression, Observer {

    private List<MathExpression> children = new ArrayList<>();

    private int lastObservedResult;

    public PlusComposite() {
        lastObservedResult = 0;
    }

    public int getResult() {
        int result = 0;
        for (MathExpression child : children) {
            result += child.getResult();
        }
        return result;
    }

    public void add(MathExpression expression) {
        this.children.add(expression);
    }

    @Override
    public void update() {
        lastObservedResult = this.getResult();
        System.out.println("PlusComposite: " + lastObservedResult);
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }
}
