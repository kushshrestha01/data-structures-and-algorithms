package queueWithStacks;

import stacksandqueues.Stack;

public class PseudoQueue {

    Stack first = new Stack();
    Stack second = new Stack();

    public PseudoQueue(){
        this.first = first;
        this.second = second;
    }

    public void enqueue(int value){
        if(first.peek() == null) {
            first.push(value);
        } else {
            while (first.peek() != null){
                second.push(first.pop());
            }
            first.push(value);
        }
        while (second.peek() != null) {
            first.push(second.pop());
        }
    }

    public int dequeue() {
        if(first.peek() == null){
            throw new NullPointerException("empty");
        } else {
            return first.pop();
        }
    }
}

