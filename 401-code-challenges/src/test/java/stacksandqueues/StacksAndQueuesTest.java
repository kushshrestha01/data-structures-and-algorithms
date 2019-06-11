package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StacksAndQueuesTest {
    @Test
    public void testStack() {
        Stack testStack = new Stack();
        int expectedOutput = 1;
        testStack.push(1);
        int output = testStack.top.value;
        assertEquals("checking can successfully push onto a stack",
                expectedOutput,
                output);

    }

    @Test
    public void testMultipleStack() {
        Stack testStack = new Stack();
        testStack.push(1);
        testStack.push(2);
        int output1 = testStack.top.value;
        int output2 = testStack.top.next.value;
        assertEquals("checking for top value",
                2,
                output1);
        assertEquals("checking for bottom value",
                1,
                output2);
    }

    @Test
    public void testPop() {
        Stack testStack = new Stack();
        testStack.push(0);
        testStack.push(2);
        testStack.push(3);
        testStack.push(4);
        int output = testStack.pop();
        assertEquals("checking can successfully pop off the stack",
                4,
                output);
    }

    @Test(expected=NullPointerException.class)
    public void testMultiplePop() {
        Stack testStack = new Stack();
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);
        testStack.pop();
        testStack.pop();
        testStack.pop();
        testStack.pop();
        assertNull("checking can successfully empty a stack after multiple pops",
                testStack);
    }

    @Test
    public void testPeek() {
        Stack testStack = new Stack();
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);
        testStack.push(4);
        Integer output = 4;
        assertEquals("Checking can successfully peek the next item on the stack",
                output,
        testStack.peek());
    }

    @Test
    public void testNewStack() {
        Stack testStack = new Stack();
        assertNull("Checking can successfully instantiate an empty stack",
                testStack.peek());
    }

    @Test
    public void testEnqueue(){
        Queue testQueue = new Queue();
        testQueue.enqueue(1);
        assertEquals("Checking can successfully enqueue into a queue",
                1,
                testQueue.front.value);
    }

    @Test
    public void testMultipleEnqueue(){
        Queue testQueue = new Queue();
        testQueue.enqueue(1);
        testQueue.enqueue(2);
        testQueue.enqueue(3);
        assertEquals("Checking can successfully multiple enqueue into a queue",
                1,
                testQueue.front.value);
        assertEquals("Checking can successfully multiple enqueue into a queue",
                3,
                testQueue.back.value);
    }

    @Test
    public void testDequeue() {
        Queue testQueue = new Queue();
        testQueue.enqueue(1);
        testQueue.enqueue(2);
        testQueue.enqueue(3);
        assertEquals("Can successfully dequeue out of a queue the expected value",
                1,
        testQueue.dequeue());
    }

    @Test
    public void testQueuePeek() {
        Queue testQueue = new Queue();
        testQueue.enqueue(1);
        testQueue.enqueue(2);
        testQueue.enqueue(3);
        assertEquals("Can successfully peek into a queue, seeing the expected value",
                1,
                testQueue.peek());
    }

    @Test(expected=NullPointerException.class)
    public void testQueueAfterDequeue() {
        Queue testQueue = new Queue();
        testQueue.enqueue(1);
        testQueue.enqueue(2);
        testQueue.enqueue(3);
        testQueue.dequeue();
        testQueue.dequeue();
        testQueue.dequeue();
        testQueue.peek();

    }

    @Test(expected=NullPointerException.class)
    public void testEmptyQueue() {
        Queue testQueue = new Queue();
        assertNull("Can successfully instantiate an empty queue",
                testQueue.peek());
    }

    @Test
    public void testEnqueDeque() {
        Queue testQueue = new Queue();
        testQueue.enqueue(1);
        testQueue.enqueue(2);
        testQueue.dequeue();
        testQueue.enqueue(3);
        assertEquals("checking the front value",
                2,
                testQueue.peek());
    }
}
