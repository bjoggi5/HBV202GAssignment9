package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite extends CompositeSuperClass {

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
}
