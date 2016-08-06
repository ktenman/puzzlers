package ee.tlu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void convertWord() {
        Main main = new Main();
        assertEquals(main.convertWord("abba"), "1a2b1a");
        assertEquals(main.convertWord("a"), "1a");
        assertEquals(main.convertWord(""), "");
        assertEquals(main.convertWord("abb"), "1a2b");
        assertEquals(main.convertWord("acccbb"), "1a3c2b");
    }


}
