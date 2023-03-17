package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class CompositeSuperClass extends Observable implements MathExpression, Observer {


    protected List<MathExpression> children = new ArrayList<>();

    private int lastObservedResult;

    public CompositeSuperClass() {
    }

    public abstract int getResult();

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
