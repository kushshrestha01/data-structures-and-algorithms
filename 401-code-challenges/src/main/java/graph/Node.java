package graph;

import java.util.HashSet;
import java.util.Set;

public class Node {

    public int value;
    public Set<Edge> edges;

    public Node(int value){
        this.value = value;
        this.edges = new HashSet<>();
    }
}
