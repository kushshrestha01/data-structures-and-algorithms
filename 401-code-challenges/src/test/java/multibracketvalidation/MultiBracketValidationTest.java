package multibracketvalidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void testMultiBracketValidation() {
        MultiBracketValidation testMultiBracketValidation = new MultiBracketValidation();

        assertTrue("checking if string is balance",
                testMultiBracketValidation.multiBracketValidation("{asdfa}asdf[]()[{sadf()}]"));

        assertFalse("checking ig string is not balanced",
                testMultiBracketValidation.multiBracketValidation("sadf9({{{)"));

        assertFalse("checking if input does not have any brackets",
                testMultiBracketValidation.multiBracketValidation("asdfgadf"));
    }

    @Test (expected=IllegalArgumentException.class)
    public void testEdgeCase() {
        MultiBracketValidation testEdgeCase = new MultiBracketValidation();
        testEdgeCase.multiBracketValidation("");
    }

}