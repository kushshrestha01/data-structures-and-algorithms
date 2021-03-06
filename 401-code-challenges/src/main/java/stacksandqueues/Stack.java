package stacksandqueues;

public class Stack {
    Node top = new Node();

    public Stack(){
       this.top = null;
    }

    public void push(int value){
        Node node = new Node();
        node.value = value;
        if(top == null) {
            top = node;
        } else {
            Node temp = new Node();
            temp = top;
            top = node;
            top.next = temp;
        }
    }

    public int pop(){
        if (top == null) {
            throw new NullPointerException("empty");
        } else {
            int temp = top.value;
            top = top.next;
            return temp;
        }
    }

    public Integer peek() {
        if (top == null) {
            return null;
        }
        return top.value;
    }
}
