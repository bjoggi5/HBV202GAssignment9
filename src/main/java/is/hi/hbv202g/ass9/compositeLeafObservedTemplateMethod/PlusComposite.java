package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite extends CompositeSuperClass {
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
}
