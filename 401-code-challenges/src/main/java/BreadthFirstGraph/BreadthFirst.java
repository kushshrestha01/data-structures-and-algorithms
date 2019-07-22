package BreadthFirstGraph;

import graph.Edge;
import graph.Graph;
import graph.Node;

import java.util.*;

public class BreadthFirst {

//    https://algorithms.tutorialhorizon.com/breadth-first-searchtraversal-in-a-graph/
    public ArrayList<Node> breadthFirstTraversal(Node node) {
        ArrayList<Node> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        result.add(node);

        while(queue.size() != 0) {
            Node temp = queue.remove();
            for (Edge e : temp.edges) {
                if (!result.contains(e.node)) {
                    queue.add(e.node);
                    result.add(e.node);
                }
            }
        }
        return result;
    }

    public static void main(String[] ags){
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

        BreadthFirst b = new BreadthFirst();
        System.out.println(b.breadthFirstTraversal(node1).get(0).value);
        System.out.println(b.breadthFirstTraversal(node1).get(1).value);
        System.out.println(b.breadthFirstTraversal(node1).get(2).value);
        System.out.println(b.breadthFirstTraversal(node1).get(3).value);
        System.out.println(b.breadthFirstTraversal(node1).get(4).value);
        System.out.println(b.breadthFirstTraversal(node1).get(5).value);

    }
}
