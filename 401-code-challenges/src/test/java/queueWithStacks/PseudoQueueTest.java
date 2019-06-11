package queueWithStacks;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void testPesudoEneque(){
        PseudoQueue testPesudo = new PseudoQueue();
        testPesudo.enqueue(1);
        testPesudo.enqueue(2);
        testPesudo.enqueue(3);
        int expectedOutput = 1;
        int output = testPesudo.dequeue();
        System.out.println(output);
        assertEquals("checking the peek value",
                expectedOutput,
                output);
    }

    @Test
    public void testPesudoDeque(){
        PseudoQueue testPesudo = new PseudoQueue();
        testPesudo.enqueue(1);
        testPesudo.enqueue(2);
        testPesudo.enqueue(3);
        testPesudo.dequeue();
        testPesudo.enqueue(4);
        testPesudo.dequeue();
        int expectedOutput = 3;
        int output = testPesudo.dequeue();
        System.out.println(output);
        assertEquals("checking the peek value",
                expectedOutput,
                output);
    }



}