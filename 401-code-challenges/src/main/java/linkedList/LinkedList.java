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
            node.next = head;
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


    //Code Challenge 06
    public void append(int value) {
        Node node = new Node();
        if(head == null) {
            head = node;
        }
        else {
            current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = node;
            current.next.value = value;
        }

    }

    public void insertBefore(int value, int newVal) {
        Node node = new Node();
        if(head == null) {
            head = node;
        }
        else {
            current = head;
            while(current.next != null){
                if(head.value == value) {
                    node.next = head;
                    head = node;
                    node.value = newVal;
                    return;
                }
                else if(current.next.value == value){
                    node.value = newVal;
                    node.next = current.next;
                    current.next = node;
                    return;
                }
                current =current.next;
            }
        }
    }

    public void insertAfter(int value, int newVal) {
        Node node = new Node();
        if(head == null) {
            head = node;
        }
        else {
            current = head;
            while(current.next != null){
                if(current.value == value){
                    node.value = newVal;
                    node.next = current.next;
                    current.next = node;
                    return;
                }
                current =current.next;
            }
            current.next = node;
            current.next.value = newVal;
        }
    }

}

