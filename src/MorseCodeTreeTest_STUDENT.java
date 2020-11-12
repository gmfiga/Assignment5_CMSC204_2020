import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MorseCodeTreeTest_STUDENT {

    MorseCodeTree tree = new MorseCodeTree();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testFetch(){
        String a = ".-";
        String letterA = tree.fetch(a);

        assertEquals(letterA, "a");

        String b = "-...";
        String letterB = tree.fetch(b);

        assertEquals(letterB, "b");

        String c = "-.-.";
        String letterC = tree.fetch(c);

        assertEquals(letterC, "c");

        String d = "-..";
        String letterD = tree.fetch(d);

        assertEquals(letterD, "d");

        String e = ".";
        String letterE = tree.fetch(e);

        assertEquals(letterE, "e");
    }

}
