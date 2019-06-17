package tree;

import code.challenges.BinarySearch;

import java.util.ArrayList;

public class Tree {
    Node root;

    public Tree() {
        this.root = null;
    }

    public Tree(Node root) {
        this.root = root;
    }

//    https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/

    public ArrayList preOrder(Node node, ArrayList<Integer> preOrderArray) {
        if (node == null) {
                return null;
            }
            preOrderArray.add(node.value);
            preOrder(node.left, preOrderArray);
            preOrder(node.right, preOrderArray);
            return preOrderArray;
    }

    public ArrayList inOrder(Node node, ArrayList<Integer> inOrderArray) {
        if(node == null) {
            return null;
        }
        inOrder(node.left, inOrderArray);
        inOrderArray.add(node.value);
        inOrder(node.right, inOrderArray);
        return inOrderArray;
    }

    public ArrayList postOrder(Node node, ArrayList<Integer> postOrderArray) {
        if(node == null){
            return null;
        }
        postOrder(node.left, postOrderArray);
        postOrder(node.right, postOrderArray);
        postOrderArray.add(node.value);
        return postOrderArray;
    }
}
