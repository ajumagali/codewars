package  com.zuhlke;

import static com.zuhlke.App.stripComments;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testStripComments()
    {
        assertEquals(
                "apples, pears\ngrapes\nbananas",
                stripComments( "apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" } )
        );

        assertEquals(
                "a\nc\nd",
                stripComments( "a #b\nc\nd $e f g", new String[] { "#", "$" } )
        );

        assertEquals(
                "a\n  b\nd",
                stripComments( "a #b\n  b \nd $e f g", new String[] { "#", "$" } )
        );

    }


}
