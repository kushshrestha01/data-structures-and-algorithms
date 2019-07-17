package GetEdge;

import graph.Edge;
import graph.Graph;
import graph.Node;

public class GetEdge {

    public String flightInfo(Graph g, String[] cities){

        int weightFinal = 0;
        for(int i = 0; i < cities.length -1 ; i++) {
            boolean exists = false;
            Node n1 = null;
            for(Node n : g.getNodes()){
                if(n.value.equals(cities[i])){
                    n1 = n;
                    break;
                }
            }
            if(n1 == null ) {
                return "False: $0";
            }

            for (Edge e : g.getNeighbors(n1)) {
                //check if the cities are in the edges
                if (e.node.value == cities[1]) {
                    // return the weight
                    weightFinal += Integer.parseInt(e.weight);
                    exists = true;
                    break;
                }
            }
            if(exists == false) {
                return "False: $0";
            }
        }

        return "True:" +"$" +weightFinal;
    }

    public static void main(String[] args){
        Graph g = new Graph();
        String[] cities = {"Pandora", "Metroville", "Arendelle", "Monstropolis", "Naboo", "Narnia"};

        Node node1 = new Node("Pandora");
        Node node2 = new Node("Metroville");
        Node node3 = new Node("Arendelle");
        Node node4 = new Node("Monstropolis");
        Node node5 = new Node("Naboo");
        Node node6 = new Node("Narnia");

        g.addNode(node1);
        g.addNode(node2);
        g.addNode(node3);
        g.addNode(node4);
        g.addNode(node5);
        g.addNode(node6);

        g.addEdge(node1, node2, "82");
        g.addEdge(node1, node3, "150");
        g.addEdge(node3,node4, "42");
        g.addEdge(node3, node2, "99");
        g.addEdge(node2, node6, "37");
        g.addEdge(node2, node5, "26");
        g.addEdge(node4, node5, "73");
        g.addEdge(node6, node5, "250");


        GetEdge getEdgeTest = new GetEdge();
        String[] test = {"Pandora", "Metroville"};
        System.out.println(getEdgeTest.flightInfo(g, test));
    }
}
