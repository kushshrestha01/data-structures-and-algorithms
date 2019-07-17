package graph;

import java.util.HashSet;
import java.util.Set;

public class Graph {

    Set<Node> nodes;

    public Graph(){
        this.nodes = new HashSet<Node>();
    }

    public Node addNode(String value) {
        Node node = new Node(value);
        this.nodes.add(node);
        return node;
    }

    public void addNode(Node node){
        this.nodes.add(node);
    }

    public void addEdge(Node node1, Node node2, String weight){
        Edge edge = new Edge(weight, node2);
        node1.edges.add(edge);
        Edge edge1 = new Edge(weight,node1);
        node2.edges.add(edge1);
    }

    public Set<Node> getNodes() {
        return this.nodes;
    }

    public Set<Edge> getNeighbors(Node node) {
        return node.edges;
    }

    public int size() {
        return this.nodes.size();
    }
}
