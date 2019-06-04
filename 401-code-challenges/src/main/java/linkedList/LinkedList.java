package linkedList;

import jdk.nashorn.internal.ir.WhileNode;
import java.util.ArrayList;

public class LinkedList {
    Node head;
    Node current;
    ArrayList<Integer> result = new ArrayList<Integer>();

    public void insert(int value) {
        Node node = new Node();
        node.value = value;
        node.next = null;
        if(head == null) {
            head = node;
        }
        else {
            head.next = node;
            head = node;
        }
    }

    public boolean includes(int value) {
        Node temp = head;
        while(temp != null){
            if(temp.value == value) {
                return true;
            }
            else {
                temp = temp.next;
            }
        }
        return false;
    }

    public ArrayList<Integer> print(){
        Node temp = head;
        int i = 0;
        while(temp != null){
            result.add(temp.value);
            temp = temp.next;
            i++;
        }
        return result;
    }

    public void append(int value) {
        Node node = new Node();
        node.value = value;
        node.next = null;
        if(head == null) {
            head = node;
            current = node;
        }
        else {
            while (node.next != null){
                if (node.next.value == value) {
                    current.next = null;
                    current.value = value;
                }
                node = node.next;
            }
        }

    }

}

