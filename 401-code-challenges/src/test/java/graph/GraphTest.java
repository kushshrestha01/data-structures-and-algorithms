package graph;

import org.junit.Test;

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
    }

//    3
    @Test
    public void testGetNodes() {
        Graph test = new Graph();
        test.addNode(5);
        test.addNode(6);
        assertEquals("checking the size of the  ");
    }

//    4
    @Test
    public void testGetNeighbor(){
        Graph test = new Graph();
    }

//    5
    @Test
    public void testNodesWithWeigths() {

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

    }

//    8
    public void testEmptyGraph() {

    }
}