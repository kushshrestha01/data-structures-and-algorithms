package graph;

import java.util.HashSet;
import java.util.Set;

public class Node {

    public String value;
    public Set<Edge> edges;

    public Node(String value){
        this.value = value;
        this.edges = new HashSet<>();
    }
}
