package linkedList;

public class LinkedList {
    Node head;

    public void insert(int value) {
        Node node = new Node();
        node.value = value;
        node.next = null;

    }

    public void print() {
        insert(10);

        Node node = head;

        System.out.println(node.value);
    }



}

