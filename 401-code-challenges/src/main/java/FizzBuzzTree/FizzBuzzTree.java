package FizzBuzzTree;

import tree.Node;
import tree.Tree;

public class FizzBuzzTree {

    public FizzBuzzTree(){}

    public Tree<Node> fizzBuzzTree(Tree<Node> tree){
        if(tree.root == null){
            return tree;
        }
        helperIfDivisible(tree.root);
        return tree;
    }

    public void helperIfDivisible(Node node) {
        if((int)node.value % 3 == 0 && (int)node.value % 5 ==0) {
            node.value = "FizzBuzz";
        }
        if ((int)node.value % 3 == 0) {
            node.value = "Fizz";
        }
        if ((int)node.value % 5 == 0) {
            node.value = "Buzz";
        }
    }
}
