package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaximumTest {

    @Test
    public void testFindMaximum(){
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        FindMaximum max = new FindMaximum();
        assertEquals("checking for maximum value",
                9,
                max.findMaximumValue(tree));
    }

    @Test
    public void testFindMaximumSecond(){
        Tree tree = new Tree();
        tree.root = new Node(-1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        FindMaximum max = new FindMaximum();
        assertEquals("checking for maximum value with negative values",
                9,
                max.findMaximumValue(tree));
    }

    @Test(expected=NullPointerException.class)
    public void testFindMaximumThird(){
        Tree tree = new Tree();
        FindMaximum max = new FindMaximum();
        assertNull("checking for null",
                max.findMaximumValue(tree));
    }


}