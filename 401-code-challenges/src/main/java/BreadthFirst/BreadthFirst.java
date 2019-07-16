package BreadthFirst;

import graph.Edge;
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
}
