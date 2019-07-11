package TreeIntersection;

import org.junit.Test;
import tree.Node;
import tree.Tree;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    @Test
    public void testTreeIntersection() {
        Tree tree1 = new Tree();
        tree1.root = new Node(8);
        tree1.root.left = new Node(3);
        tree1.root.right = new Node(10);
        tree1.root.left.left = new Node(218);
        tree1.root.left.right = new Node(15);
        tree1.root.right.right = new Node(14);

        Tree tree2 = new Tree();
        tree2.root = new Node(218);
        tree2.root.left = new Node(8);
        tree2.root.right = new Node(112);
        tree2.root.left.left = new Node(112);
        tree2.root.left.right = new Node(1521);
        tree2.root.right.right = new Node(1214);

        TreeIntersection test = new TreeIntersection();

        ArrayList expectedOutput = new ArrayList();
        expectedOutput.add(8); expectedOutput.add(218);

        ArrayList output = test.tree_intersection(tree1, tree2);

        assertEquals("Checking the common values",
                expectedOutput,
                output);
    }

    @Test
    public void testTreeIntersectionWithDuplicates() {
        Tree tree1 = new Tree();
        tree1.root = new Node(8);
        tree1.root.left = new Node(3);
        tree1.root.right = new Node(10);
        tree1.root.left.left = new Node(218);
        tree1.root.left.right = new Node(15);
        tree1.root.right.right = new Node(14);

        Tree tree2 = new Tree();
        tree2.root = new Node(218);
        tree2.root.left = new Node(8);
        tree2.root.right = new Node(112);
        tree2.root.left.left = new Node(8);
        tree2.root.left.right = new Node(1521);
        tree2.root.right.right = new Node(1214);

        TreeIntersection test = new TreeIntersection();

        ArrayList expectedOutput = new ArrayList();
        expectedOutput.add(8); expectedOutput.add(218);

        ArrayList output = test.tree_intersection(tree1, tree2);

        assertEquals("Checking with duplicate values with in a tree",
                expectedOutput,
                output);
    }

    @Test
    public void testTreeIntersectionWithNoCommon() {
        Tree tree1 = new Tree();
        tree1.root = new Node(8);
        tree1.root.left = new Node(3);
        tree1.root.right = new Node(10);
        tree1.root.left.left = new Node(218);
        tree1.root.left.right = new Node(15);
        tree1.root.right.right = new Node(14);

        Tree tree2 = new Tree();
        tree2.root = new Node(218123);
        tree2.root.left = new Node(812);
        tree2.root.right = new Node(112);
        tree2.root.left.left = new Node(81423);
        tree2.root.left.right = new Node(1521);
        tree2.root.right.right = new Node(1214);

        TreeIntersection test = new TreeIntersection();

        ArrayList expectedOutput = new ArrayList();

        ArrayList output = test.tree_intersection(tree1, tree2);

        assertEquals("Checking the no common values",
                expectedOutput,
                output);
    }

}