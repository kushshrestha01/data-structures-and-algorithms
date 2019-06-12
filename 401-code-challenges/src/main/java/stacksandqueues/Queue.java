package stacksandqueues;

public class Queue {
    Node back = new Node();
    Node front = new Node();

    public Queue(){

        this.back = null;
        this.front = null;
    }

    public void enqueue(int value) {
        Node node = new Node();
        node.value = value;
        if(back == null) {
            back = node;
            front = node;
        } else {
            back.next = node;
            back = node;
            back.next = null;
        }
    }

    public int dequeue() {
        Node node = new Node();
        if (front == null) {
            throw new NullPointerException("empty");
        } else {
            node = front;
            front = front.next;
        }
        return node.value;
    }

    public int peek() {
        Node node = new Node();
        if (front == null) {
            throw new NullPointerException("empty");
        } else {
            node = front;
        }
        return node.value;
    }
}
