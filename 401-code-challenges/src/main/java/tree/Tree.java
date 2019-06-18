package tree;

import code.challenges.BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class Tree<T> {
    public Node<T> root;

    public Tree() {
        this.root = null;
    }

    public Tree(Node root) {
        this.root = root;
    }

//    https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/

    public ArrayList preOrder(Node node, ArrayList<T> preOrderArray) {
        if (node == null) {
                return null;
            }
            preOrderArray.add((T)node.value);
            preOrder(node.left, preOrderArray);
            preOrder(node.right, preOrderArray);
            return preOrderArray;
    }

    public ArrayList inOrder(Node node, ArrayList<T> inOrderArray) {
        if(node == null) {
            return null;
        }
        inOrder(node.left, inOrderArray);
        inOrderArray.add((T)node.value);
        inOrder(node.right, inOrderArray);
        return inOrderArray;
    }

    public ArrayList postOrder(Node node, ArrayList<T> postOrderArray) {
        if(node == null){
            return null;
        }
        postOrder(node.left, postOrderArray);
        postOrder(node.right, postOrderArray);
        postOrderArray.add((T)node.value);
        return postOrderArray;
    }
}
