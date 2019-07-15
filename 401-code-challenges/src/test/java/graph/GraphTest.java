package graph;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Set;

import static org.junit.Assert.*;

public class GraphTest {

//    1
    @Test
    public void testAddNode(){
        Graph test = new Graph();
        test.addNode(5);
        assertEquals("checking if value is added",
                1,
                test.size());
    }

//    2
    @Test
    public void testAddEdge(){
        Graph test = new Graph();
        Node node1 = new Node(5); Node node2 = new Node(6); int weight = 0;
        test.addEdge(node1, node2, weight);
        assertEquals("checking the size of the edge",
                1,
                node1.edges.size());
        assertEquals("checking the size of the edge",
                1,
                node2.edges.size());
    }

//    3
    @Test
    public void testGetNodes() {
        Graph test = new Graph();
        test.addNode(5);
        test.addNode(6);
        assertEquals("checking the size of the graph",
                2,
                test.size());
    }

//    4
    @Test
    public void testGetNeighbor(){
        Graph test = new Graph();
        Node node1 = new Node(5); Node node2 = new Node(6); Node node3 = new Node(7);
        int weight = 0;
        test.addEdge(node1, node2, weight);
        test.addEdge(node1, node3, weight);
        assertEquals("checking the size of the edge of node1",
                2,
                node1.edges.size());
        assertEquals("checking the size of the edge of node2",
                1,
                node2.edges.size());
        assertEquals("checking the size of the edge of node3",
                1,
                node3.edges.size());
    }

//    5
    @Test
    public void testNodesWithWeights() {
        Graph test = new Graph();
        Node node1 = new Node(5); Node node2 = new Node(6); int weight = 1;
        test.addEdge(node1, node2, weight);
        int expectedOutput = 1;
        ArrayList<Integer> actualOutput = new ArrayList<>();
        for(Edge s: node1.edges) {
            actualOutput.add(s.weight);

        }
        int result = actualOutput.get(0);
        assertEquals("checking the value of weight",
                expectedOutput,
                result);
    }

//    6
    @Test
    public void testSize() {
        Graph test = new Graph();
        test.addNode(5);
        test.addNode(132);
        assertEquals("checking the size of the graph",
                2,
                test.size());
    }

//    7
    @Test
    public void testOneNodeOneEdge() {
        Graph test = new Graph();
        Node node1 = new Node(5); Node node2 = new Node(6); int weight = 0;
        test.addEdge(node1, node2, weight);
        assertEquals("checking the size of neighbor is 1",
                1,
                test.getNeighbors(node1).size());
    }

//    8
    @Test
    public void testEmptyGraph() {
        Graph test = new Graph();
        assertEquals("checking the size of empty Graph",
                0,
                test.size());
    }
}