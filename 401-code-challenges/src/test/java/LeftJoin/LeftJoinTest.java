package LeftJoin;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class LeftJoinTest {

    @Test
    public void testLeftJoin(){
        LeftJoin test = new LeftJoin();

        HashMap<String, String> hmap1 = new HashMap<String, String>();
        hmap1.put("fond", "enamored");
        hmap1.put("wrath", "anger");
        hmap1.put("deligent", "employed");
        hmap1.put("outfit", "grab");
        hmap1.put("guide", "usher");

        HashMap<String, String> hmap2 = new HashMap<String, String>();
        hmap2.put("fond", "averse");
        hmap2.put("wrath", "delight");
        hmap2.put("deligent", "idle");
        hmap2.put("guide", "follow");
        hmap2.put("flow", "jam");

        HashMap<String, ArrayList<String>> result = test.leftJoin(hmap1, hmap2);

        assertEquals("checking the size of the result hashmap",
                5,
                result.size());

        ArrayList<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("anger"); expectedOutput.add("delight");
        ArrayList<String> output = result.get("wrath");

        assertEquals("checking if the value of the left join key",
                expectedOutput,
                output);

        ArrayList<String> expectedOutput2 = new ArrayList<>();
        expectedOutput2.add("grab"); expectedOutput2.add(null);

        ArrayList<String> output2 = result.get("outfit");

        assertEquals("checking with the null value",
                expectedOutput2,
                output2);
    }
}