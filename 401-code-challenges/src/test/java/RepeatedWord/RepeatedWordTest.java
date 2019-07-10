package RepeatedWord;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class RepeatedWordTest {
//    https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
//    https://stackoverflow.com/questions/55369751/junit-test-failed-for-testing-system-out-println-result
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
    @Test
    public void testFirstRepeatedWord(){
        RepeatedWord test = new RepeatedWord();
        String expectedOutput = "it";
        test.firstRepeatedWord("It was the best of times, it was the worst of times, it was the age of wisdom");
        assertEquals(expectedOutput , outContent.toString());
    }

}