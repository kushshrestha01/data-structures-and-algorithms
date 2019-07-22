package tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeTest {

    @Test
    public void testTreeEmpty() {
        Tree tree = new Tree();
        assertNull(tree.root);
    }

    @Test
    public void testTreeSingle() {
        Tree tree = new Tree();
        tree.root = new Node(8);
        assertEquals("checking the root value",
                8,
                tree.root.value);
    }

    @Test
    public void testTreeLeftAndRight() {
        Tree tree = new Tree();
        tree.root = new Node(8);
        tree.root.left = new Node(3);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(1);
        assertEquals("checking left value",
                1,
                tree.root.left.left.value);
        assertEquals("checking right value",
                10,
                tree.root.right.value);
    }

    @Test
    public void testTreePreOrder() {
        Tree tree = new Tree();
        tree.root = new Node(8);
        tree.root.left = new Node(3);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(15);
        tree.root.right.right = new Node(14);
        tree.root.right.left = new Node(6);

        ArrayList<Integer> expectedOutput = new ArrayList<Integer>();
        expectedOutput.add(8);expectedOutput.add(3);expectedOutput.add(1);
        expectedOutput.add(15);expectedOutput.add(10);expectedOutput.add(6);expectedOutput.add(14);

        System.out.println(tree.preOrder(tree.root, new ArrayList<Integer>()));
        assertEquals("checking preorder",
                expectedOutput,
                tree.preOrder(tree.root, new ArrayList<Integer>()));
    }

    @Test
    public void testTreeInOrder() {
        Tree tree = new Tree();
        tree.root = new Node(8);
        tree.root.left = new Node(3);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(15);
        tree.root.right.right = new Node(14);
        tree.root.right.left = new Node(6);

        ArrayList<Integer> expectedOutput = new ArrayList<Integer>();
        expectedOutput.add(1);expectedOutput.add(3);expectedOutput.add(15);
        expectedOutput.add(8);expectedOutput.add(6);expectedOutput.add(10);expectedOutput.add(14);

        System.out.println(tree.inOrder(tree.root,new ArrayList<Integer>() ));
        assertEquals("checking inorder",
                expectedOutput,
                tree.inOrder(tree.root, new ArrayList<Integer>()));
    }

    @Test
    public void testTreePostOrder() {
        Tree tree = new Tree();
        tree.root = new Node(8);
        tree.root.left = new Node(3);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(15);
        tree.root.right.right = new Node(14);
        tree.root.right.left = new Node(6);

        ArrayList<Integer> expectedOutput = new ArrayList<Integer>();
        expectedOutput.add(1);expectedOutput.add(15);expectedOutput.add(3);expectedOutput.add(6);
        expectedOutput.add(14);expectedOutput.add(10);expectedOutput.add(8);

        System.out.println(tree.postOrder(tree.root,new ArrayList<Integer>() ));
        assertEquals("checking postorder",
                expectedOutput,
                tree.postOrder(tree.root, new ArrayList<Integer>()));
    }
}