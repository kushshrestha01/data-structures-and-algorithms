package tree;

public class BinarySearchTree {

    Node root;

    BinarySearchTree() {
        root = null;
    }

    //    https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
    public Node helperAdd(Node root, int value) {
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

    public void add(int value) {
        root = helperAdd(root, value);
    }

    public boolean helperContains(Node root, int value) {
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

    public boolean contains(int value) {
        if(helperContains(root, value)){
            return true;
        } else
            return false;
    }

}
