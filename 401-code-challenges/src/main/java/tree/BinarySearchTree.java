package tree;

public class BinarySearchTree{

    public Node<Integer> root;

    BinarySearchTree() {
        root = null;
    }

    //    https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/

    public Node helperAdd(Node<Integer> root, Integer value) {
        if(root == null){
            return new Node(value);
        }
        if(root.value > value) {
            root.left = helperAdd(root.left, value);

        } else if(root.value < value) {
            root.right = helperAdd(root.right, value);
        }
        return root;
    }

    public void add(Integer value) {
        root = helperAdd(root, value);
    }

    public boolean helperContains(Node<Integer> root, Integer value) {
        if(root.value == value) {
            return true;
        }
        while(root != null) {
            if(root.value > value){
                root = root.left;
            } else if (root.value < value) {
                root = root.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean contains(Integer value) {
        if(helperContains(root, value)){
            return true;
        } else
            return false;
    }

}
