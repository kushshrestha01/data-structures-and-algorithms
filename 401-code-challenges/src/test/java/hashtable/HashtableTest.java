package hashtable;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    @Test
    public void testAdd(){
        Hashtable test = new Hashtable(1024);
        test.add("John", "Husband");
        test.add("Cathy", "Boss");
        test.add("Amanda", "The Real Boss");
        test.add("Allie", "Kid");


    }

    @Test
    public void testGet() {
        Hashtable test = new Hashtable(1024);
        test.add("John", "Husband");
        test.add("Cathy", "Boss");
        test.add("Amanda", "The Real Boss");
        test.add("Allie", "Kid");

        assertEquals("Checking to see if the key returns the right value",
                "Husband",
                test.get("John"));
    }

    @Test
    public void testContains() {
        Hashtable test = new Hashtable(1024);
        test.add("John", "Husband");
        test.add("Cathy", "Boss");
        test.add("Amanda", "The Real Boss");
        test.add("Allie", "Kid");

        assertTrue("Checking to see if the key exist or not", test.contains("Cathy"));
    }

    @Test
    public void testHash() {
        Hashtable test = new Hashtable(1024);
        test.add("John", "Husband");
        test.add("Cathy", "Boss");
        test.add("Amanda", "The Real Boss");
        test.add("Allie", "Kid");

        System.out.println(test.hash("John"));
        assertEquals("Checking the hash value of John",
                409,
                test.hash("John"));
    }
}