package FizzBuzzTree;

import org.junit.Test;
import tree.Node;
import tree.Tree;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    @Test
    public void testFizzBuzz(){
        FizzBuzzTree test = new FizzBuzzTree();

        Tree tree = new Tree();
        tree.root = new Node(8);
        tree.root.left = new Node(3);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(15);
        tree.root.right.right = new Node(14);

        test.fizzBuzzTree(tree);

        ArrayList<String> expectedOutput = new ArrayList<String>();
        expectedOutput.add("8");expectedOutput.add("Fizz");expectedOutput.add("1");
        expectedOutput.add("FizzBuzz");expectedOutput.add("Buzz");expectedOutput.add("14");

        ArrayList<String> actualOutput = tree.preOrder(tree.root, new ArrayList<String>());

        assertEquals("testing Fizz node",
                "Fizz",
                tree.root.left.value);

        assertEquals("testing FizzBuzz node",
                "FizzBuzz",
                tree.root.left.right.value);

        assertEquals("testing Buzz node",
                "Buzz",
                tree.root.right.value);

    }


}