package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstClass extends Tree {

//    https://www.geeksforgeeks.org/level-order-tree-traversal/
    public void breadthFirst(Tree tree){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(tree.root);
        int i = 0;
        while(!queue.isEmpty()){
            i++;
            Node temp = new Node();
            temp = queue.poll();
            System.out.println(temp.value);
            if(temp.left != null) {
                queue.add(temp.left);
            }

            if(temp.right != null) {
                queue.add(temp.right);
            }
        }
    }
}
