package tree;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BreadthFirstClassTest {

//    https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
//    https://stackoverflow.com/questions/55369751/junit-test-failed-for-testing-system-out-println-result
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
    @Test
    public void testBreadthFirst(){
        BreadthFirstClass test = new BreadthFirstClass();
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        String expectedOutput = 1 + "\n" + 2 + "\n" + 3 + "\n" + 4 + "\n" + 5 + "\n";
        test.breadthFirst(tree);
        assertEquals(expectedOutput , outContent.toString());
    }

}