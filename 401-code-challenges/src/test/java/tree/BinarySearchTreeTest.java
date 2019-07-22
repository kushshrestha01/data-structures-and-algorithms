package tree;

import org.checkerframework.checker.units.qual.A;
import org.junit.Test;

import java.util.ArrayList;

import static javafx.scene.input.KeyCode.T;
import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void testBinarySearchTree() {
        BinarySearchTree test = new BinarySearchTree();
        test.add(4);
        test.add(2);
        test.add(3);
        test.add(1);
        test.add(5);
        test.add(6);
        test.add(7);
        test.add(8);

        Tree t = new Tree();
        ArrayList<Integer> preOrderArray = new ArrayList<>();
        t.inOrder(test.root, preOrderArray);
        ArrayList<Integer> expectedOutput = new ArrayList<>();
        expectedOutput.add(1);
        expectedOutput.add(2);
        expectedOutput.add(3);
        expectedOutput.add(4);
        expectedOutput.add(5);
        expectedOutput.add(6);
        expectedOutput.add(7);
        expectedOutput.add(8);



        assertEquals("checking the binarysearch tree value",
                expectedOutput,
                preOrderArray);
    }
}