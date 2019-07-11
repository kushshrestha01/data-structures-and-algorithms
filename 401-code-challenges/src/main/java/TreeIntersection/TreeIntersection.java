package TreeIntersection;

import org.checkerframework.checker.units.qual.A;
import tree.Node;
import tree.Node;
import tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class TreeIntersection<T> {

    public ArrayList<T> tree_intersection(Tree first, Tree second){
        ArrayList<T> firstValues = new ArrayList<T>();
        ArrayList<T> secondValues = new ArrayList<T>();
        ArrayList<T> commonValues = new ArrayList<T>();
        ArrayList<T> noDuplicateValues = new ArrayList<T>();

        Tree count = new Tree();
        count.preOrder(first.root, firstValues);
        count.preOrder(second.root, secondValues);

        for(T value: firstValues){
            if(secondValues.contains(value)){
                commonValues.add(value);
            }
        }

        for(T value: commonValues){
            if(!noDuplicateValues.contains(value)){
                noDuplicateValues.add(value);
            }
        }
        return noDuplicateValues;
    }
}
