import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class LscTest {

    @Test
    void lcs() {
        assertEquals("", Lsc.lcs("", ""));
    }
}