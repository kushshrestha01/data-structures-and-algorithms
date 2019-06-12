package fifoAnimalShelter;

import stacksandqueues.Node;

public class AnimalShelter {

    AnimalNode catFront = new AnimalNode();
    AnimalNode catBack = new AnimalNode();

    AnimalNode dogFront = new AnimalNode();
    AnimalNode dogBack = new AnimalNode();




    public void enqueue(String animal){
        if (animal == "cat") {
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
        } else if (animal == "dog") {
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
            System.out.println("Invalid Entry");
    }

    public String dequeue(String preferredAnimal) {
        if(preferredAnimal == "cat") {
            AnimalNode node = new AnimalNode();
            if (catFront == null) {
                throw new NullPointerException("empty");
            } else {
                node = catFront;
                catFront = catFront.next;
            }
            return node.value;
        } else if(preferredAnimal == "dog") {
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
