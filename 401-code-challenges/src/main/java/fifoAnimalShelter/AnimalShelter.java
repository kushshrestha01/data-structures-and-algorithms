package fifoAnimalShelter;

import stacksandqueues.Node;

public class AnimalShelter {

    AnimalNode front = new AnimalNode();
    AnimalNode back = new AnimalNode();

    public void enqueue(String value){
        AnimalNode node = new AnimalNode();
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

    public String dequeue() {
        AnimalNode node = new AnimalNode();
        if(front == null) {
            throw new NullPointerException("empty");
        } else {
            node = front;
            front = front.next;
        }
        return node.value;
    }

}
