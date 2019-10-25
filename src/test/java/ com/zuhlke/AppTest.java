package  com.zuhlke;

import org.junit.Test;

import static com.zuhlke.App.*;
import static junit.framework.TestCase.assertEquals;

public class AppTest
{

    @Test
    public void testAddLettersNoInput() {
        String expected = "z";
        assertEquals(expected, addLetters());
    }

    @Test
    public void testAddLettersWithZAsInput() {
        String expected = "z";
        assertEquals(expected, addLetters("z"));
    }

    @Test
    public void fixedTests() {
        assertEquals("f", addLetters("a", "b", "c"));
        assertEquals("z", addLetters("z"));
        assertEquals("c", addLetters("a", "b"));
        assertEquals("c", addLetters("c"));
        assertEquals("a", addLetters("z", "a"));
        assertEquals("d", addLetters("y", "c", "b"));
        assertEquals("z", addLetters());
    }

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

    @Test
    public void persistenceSingleDigit() {
        assertEquals(0, persistence(4));
    }

    @Test
    public void persistenceDoubleDigit() {
        assertEquals(3, persistence(39));
        assertEquals(2, persistence(25));
    }

    @Test
    public void persistenceTripleDigit() {
        assertEquals(4, persistence(999));
    }

}
