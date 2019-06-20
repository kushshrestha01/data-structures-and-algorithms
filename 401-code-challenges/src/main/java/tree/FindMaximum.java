package tree;

import java.util.ArrayList;
import java.util.Collections;

public class FindMaximum extends Tree {

    public int findMaximumValue(Tree tree) {
        if(tree.root == null) {
            throw new NullPointerException();
        }
        ArrayList<Integer> allValues = new ArrayList<Integer>();
        tree.preOrder(tree.root, allValues);
        return Collections.max(allValues);
    }
}
