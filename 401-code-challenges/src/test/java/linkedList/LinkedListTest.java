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
                pointTest.head.value);

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
                multipleTest.head.value);
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

    //Code Challenge 06
    @Test
    public void testAppend() {
        LinkedList appendTest = new LinkedList();
        appendTest.insert(10);
        appendTest.insert(11);
        appendTest.insert(12);
        appendTest.insert(13);
        int expectedOutput = 2;
        appendTest.append(2);
        int output = appendTest.print().get(4);
        assertEquals("checking the print values",
                expectedOutput,
                output);
    }

    @Test
    public void testAppendMultiple() {
        LinkedList appendTest = new LinkedList();
        appendTest.insert(10);
        appendTest.insert(11);
        appendTest.insert(12);
        appendTest.insert(13);
        appendTest.append(2);
        int expectedOutput = 2;
        appendTest.append(3);
        int expectedOutput2 = 3;
        int output = appendTest.print().get(4);
        int output2 = appendTest.print().get(5);

        assertEquals("checking the print values",
                expectedOutput,
                output);
        assertEquals("checking the print values",
                expectedOutput2,
                output2);
    }

    @Test
    public void testInsertBefore() {
        LinkedList insertBeforeTest = new LinkedList();
        insertBeforeTest.insert(10);
        insertBeforeTest.insert(11);
        insertBeforeTest.insert(12);
        insertBeforeTest.insert(13);
        insertBeforeTest.insertBefore(11,12323);
        int expectedOutput = 12323;
        int output = insertBeforeTest.print().get(2);
        assertEquals("checking for insert before function",
                expectedOutput,
                output);
    }

    @Test
    public void testInsertBeforeFirstNode() {
        LinkedList insertBeforeTest = new LinkedList();
        insertBeforeTest.insert(10);
        insertBeforeTest.insert(11);
        insertBeforeTest.insert(12);
        insertBeforeTest.insert(13);
        insertBeforeTest.insertBefore(13,12323);
        int expectedOutput = 12323;
        int output = insertBeforeTest.print().get(0);
        assertEquals("checking for insert before function",
                expectedOutput,
                output);
    }

    @Test
    public void testInsertAfter() {
        LinkedList insertAfterTest = new LinkedList();
        insertAfterTest.insert(10);
        insertAfterTest.insert(11);
        insertAfterTest.insert(12);
        insertAfterTest.insert(13);
        insertAfterTest.insertAfter(11,1111);
        int expectedOutput = 1111;
        int output = insertAfterTest.print().get(3);
        assertEquals("checking for insert after function",
                expectedOutput,
                output);
    }

    @Test
    public void testInsertAfterLastNode() {
        LinkedList insertAfterTest = new LinkedList();
        insertAfterTest.insert(10);
        insertAfterTest.insert(11);
        insertAfterTest.insert(12);
        insertAfterTest.insert(13);
        insertAfterTest.insertAfter(10,1111);
        int expectedOutput = 1111;
        int output = insertAfterTest.print().get(4);
        assertEquals("checking for insert after function",
                expectedOutput,
                output);
    }
}