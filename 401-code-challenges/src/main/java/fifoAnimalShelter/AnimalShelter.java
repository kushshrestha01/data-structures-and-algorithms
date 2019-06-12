package fifoAnimalShelter;

import stacksandqueues.Node;

public class AnimalShelter {

    AnimalNode catFront = new AnimalNode();
    AnimalNode catBack = new AnimalNode();

    AnimalNode dogFront = new AnimalNode();
    AnimalNode dogBack = new AnimalNode();

    public AnimalShelter(){
        this.catBack = null;
        this.catFront = null;
        this.dogBack = null;
        this.dogFront = null;
    }

    public void enqueue(String animal){
        if (animal.equals("cat")){
            AnimalNode node = new AnimalNode();
            node.value = animal;
            if (catBack == null) {
                catBack = node;
                catFront = node;
            } else {
                catBack.next = node;
                catBack = node;
                catBack.next = null;
            }
        } else if (animal.equals("dog")) {
            AnimalNode node = new AnimalNode();
            node.value = animal;
            if (dogBack == null) {
                dogBack = node;
                dogFront = node;
            } else {
                dogBack.next = node;
                dogBack = node;
                dogBack.next = null;
            }
        } else
            throw new IllegalArgumentException();
    }

    public String dequeue(String preferredAnimal) {
        if(preferredAnimal.equals("cat")) {
            AnimalNode node = new AnimalNode();
            if (catFront == null) {
                throw new NullPointerException("empty");
            } else {
                node = catFront;
                catFront = catFront.next;
            }
            return node.value;
        } else if(preferredAnimal.equals("dog")) {
            AnimalNode node = new AnimalNode();
            if (dogFront == null) {
                throw new NullPointerException("empty");
            } else {
                node = dogFront;
                dogFront = dogFront.next;
            }
            return node.value;
        }
        return null;
    }

}
