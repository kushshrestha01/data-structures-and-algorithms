package linkedList;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void testEmpty() {
        LinkedList emptyTest = new LinkedList();
        Object expectedOutput = null;
        assertEquals("checking for null",
                expectedOutput,
                emptyTest.head);

    }

    @Test
    public void testInsert() {
        LinkedList insertTest = new LinkedList();
        int expectedOutput = 10;
        insertTest.insert(10);
        assertEquals("checking insert method",
                expectedOutput,
                insertTest.head.value);
    }

    @Test
    public void testPoint() {
        LinkedList pointTest = new LinkedList();
        pointTest.insert(10);
        pointTest.insert(11);
        int expectedOutput = 10;
        assertEquals("checking if the head points to first node",
                expectedOutput,
                pointTest.head.next.value);

    }

    @Test
    public void testMultiple() {
        LinkedList multipleTest = new LinkedList();
        multipleTest.insert(10);
        multipleTest.insert(11);
        multipleTest.insert(12);
        multipleTest.insert(13);
        int expectedOutput = 10;
        assertEquals("Checking if inserts multiple nodes into the linked list",
                expectedOutput,
                multipleTest.head.next.next.next.value);
    }

    @Test
    public void testExist() {
        LinkedList existTest = new LinkedList();
        existTest.insert(10);
        existTest.insert(11);
        existTest.insert(12);
        existTest.insert(13);
        assertTrue("Checking if input value already exists",
                existTest.includes(13));
    }

    @Test
    public void testNotExist() {
        LinkedList existTest = new LinkedList();
        existTest.insert(10);
        existTest.insert(11);
        existTest.insert(12);
        existTest.insert(13);
        assertFalse("Checking if input value already exists",
                existTest.includes(14));
    }

    @Test
    public void testPrint() {
        LinkedList printTest = new LinkedList();
        printTest.insert(10);
        printTest.insert(11);
        printTest.insert(12);
        printTest.insert(13);
        int expectedOutput = 13;
        int output = printTest.print().get(0);

        assertEquals("checking the print values",
                expectedOutput,
               output);
    }

    @Test
    public void testLinkedList() {
        LinkedList linkedListTest = new LinkedList();
        linkedListTest.insert(10);
        linkedListTest.insert(11);
        linkedListTest.insert(12);
        linkedListTest.insert(13);
        linkedListTest.insert(14);
        int expectedOutput = 11;
        int output = linkedListTest.linkedList(1);
        assertEquals("checking the linkedList function",
                expectedOutput,
                output);

    }
    public void testKGreaterThan() {
        LinkedList linkedListTest = new LinkedList();
        linkedListTest.insert(10);
        linkedListTest.insert(11);
        linkedListTest.insert(12);
        linkedListTest.insert(13);
        linkedListTest.insert(14);
    }

}