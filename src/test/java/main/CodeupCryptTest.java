package main;

import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {
    private double requiredVersion = 1.1;

    @Test
    public void testVersion() {
        assertNotNull(CodeupCrypt.version);
        assertEquals(requiredVersion, CodeupCrypt.version.doubleValue(), 0);
    }

    @Test
    public void testHashPassword() {
        assertEquals("x4Z4", CodeupCrypt.hashPassword("xaZA"));
        assertEquals("p3Q3", CodeupCrypt.hashPassword("peQE"));
        assertEquals("p1Q1", CodeupCrypt.hashPassword("piQI"));
        assertEquals("p0Q0", CodeupCrypt.hashPassword("poQO"));
        assertEquals("p9Q9", CodeupCrypt.hashPassword("puQU"));

        assertEquals("43109", CodeupCrypt.hashPassword("aEiOu"));
        assertEquals("", CodeupCrypt.hashPassword(""));
        assertEquals("sPcL", CodeupCrypt.hashPassword("sPcL"));
    }
}
