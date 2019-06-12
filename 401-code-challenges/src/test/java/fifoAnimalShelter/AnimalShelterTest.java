package fifoAnimalShelter;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void testEnqueueCat() {
        AnimalShelter testEnqueue = new AnimalShelter();
        testEnqueue.enqueue("cat");
        testEnqueue.enqueue("cat");
        testEnqueue.enqueue("cat");
        assertEquals("checking if cat queue has been created",
                "cat",
                testEnqueue.catBack.value);
        assertEquals("checking if cat queue has been created",
                "cat",
                testEnqueue.catFront.value);
    }

    @Test
    public void testEnqueueDog() {
        AnimalShelter testEnqueue = new AnimalShelter();
        testEnqueue.enqueue("dog");
        testEnqueue.enqueue("dog");
        testEnqueue.enqueue("dog");
        assertEquals("checking if dog queue has been created",
                "dog",
                testEnqueue.dogBack.value);
        assertEquals("checking if dog queue has been created",
                "dog",
                testEnqueue.dogFront.value);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testEnqueueNotCatorDog() {
        AnimalShelter testEnqueue = new AnimalShelter();
        testEnqueue.enqueue("asdfasdf");
    }

    @Test
    public void testDequeueCat() {
        AnimalShelter testDequeue = new AnimalShelter();
        testDequeue.enqueue("cat");
        testDequeue.enqueue("cat");
        testDequeue.enqueue("cat");
        testDequeue.dequeue("cat");
        assertEquals("checking if cat dequeue works",
                "cat",
                testDequeue.dequeue("cat"));
        assertNull("checking if dequeue works when input is not cat or dog",
                testDequeue.dequeue("asdfasdf"));

    }

    @Test
    public void testDequeueDog() {
        AnimalShelter testDequeue = new AnimalShelter();
        testDequeue.enqueue("dog");
        testDequeue.enqueue("dog");
        testDequeue.enqueue("dog");
        testDequeue.dequeue("dog");
        assertEquals("checking if dog dequeue works",
                "dog",
                testDequeue.dequeue("dog"));
        assertNull("checking if dequeue works when input is not cat or dog",
                testDequeue.dequeue("asdfasdf"));

    }



}