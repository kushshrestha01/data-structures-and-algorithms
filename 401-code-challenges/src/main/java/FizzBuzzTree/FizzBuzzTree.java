package FizzBuzzTree;

import tree.Node;
import tree.Tree;

import java.util.ArrayList;

public class FizzBuzzTree {

    public FizzBuzzTree(){}

    public Tree<Node> fizzBuzzTree(Tree<Node> tree){
        if(tree.root == null){
            return tree;
        }
        preOrder(tree.root);
        return tree;
    }

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        helperIfDivisible(node);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void helperIfDivisible(Node node) {
        if((int)node.value % 3 == 0 && (int)node.value % 5 ==0) {
            node.value = "FizzBuzz";
        } else if ((int)node.value % 3 == 0) {
            node.value = "Fizz";
        } else if ((int)node.value % 5 == 0) {
            node.value = "Buzz";
        }
    }
}
