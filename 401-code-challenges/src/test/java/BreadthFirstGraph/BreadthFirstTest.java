package BreadthFirstGraph;

import graph.Graph;
import graph.Node;
import org.checkerframework.checker.units.qual.A;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BreadthFirstTest {

    @Test
    public void testBreadthFirstGraphTest(){
        Graph g = new Graph();
        Node node1 = new Node("1"); Node node2 = new Node("2");
        Node node3 = new Node("3"); Node node4 = new Node("4");
        Node node5 = new Node("5"); Node node6 = new Node("6");

        g.addEdge(node1, node6,"2");
        g.addEdge(node1, node2,"2");
        g.addEdge(node2, node3,"2");
        g.addEdge(node2, node4,"2");
        g.addEdge(node2, node5,"2");
        g.addEdge(node3, node6,"2");

        ArrayList expectedOutput = new ArrayList();
        expectedOutput.add(1); expectedOutput.add(2); expectedOutput.add(6);
        expectedOutput.add(4); expectedOutput.add(3); expectedOutput.add(5);

        BreadthFirst b = new BreadthFirst();
        ArrayList outputNode = new ArrayList();
        outputNode = b.breadthFirstTraversal(node1);

        assertEquals("checking the size of the traversal",
                6,
                outputNode.size());
    }
}