package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {

    @Test
    public void testTree() {
        Tree tree = new Tree();
        tree.root = new Node(8);
        tree.root.left = new Node(3);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(6);
        tree.root.right.right = new Node(14);

       }

}