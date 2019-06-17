package tree;

import code.challenges.BinarySearch;

import java.util.ArrayList;

public class Tree {
    Node root;

    public Tree() {
        this.root = null;
    }

//    https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/

    ArrayList<Integer> preOrder = new ArrayList<Integer>();
    public void preOrder(Node node) {
        if(node == null){
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(Node node) {
        if(node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.value+ " ");
        inOrder(node.right);
    }

    public void postOrder(Node node) {
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value + " ");
    }

    public static void main(String[] args)
    {
        Tree tree = new Tree();
        tree.root = new Node(8);
        tree.root.left = new Node(3);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(6);
        tree.root.right.right = new Node(14);

        System.out.println("Preorder traversal of binary tree is ");
        tree.preOrder(tree.root);

        System.out.println("\nInorder traversal of binary tree is ");
        tree.inOrder(tree.root);

        System.out.println("\nPostorder traversal of binary tree is ");
        tree.postOrder(tree.root);


        BinarySearchTree newTree = new BinarySearchTree();
        newTree.add( 3);
        newTree.add( 1);
        newTree.add( 6);
        newTree.add(10);
        newTree.add( 9);
        newTree.add(14);

        System.out.println("Inorder traversal of binary tree is after adding ");
        tree.inOrder(newTree.root);

        System.out.println(newTree.contains(9));

    }

}
