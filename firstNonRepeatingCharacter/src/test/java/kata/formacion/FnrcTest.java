package kata.formacion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FnrcTest {

    @Test
    void shouldReturn_null(){
        assertNull(Fnrc.firstNonRepeatingLetter("aaeeiioouu"));
    }

    @Test
    void shouldReturn_a(){
        assertEquals(Fnrc.firstNonRepeatingLetter("a"), 'a');
    }

    @Test
    void shouldReturn_e(){
        assertEquals(Fnrc.firstNonRepeatingLetter("session"), 'e');
    }

    @Test
    void shouldReturn_E(){
        assertEquals(Fnrc.firstNonRepeatingLetter("sESSion"), 'E');
    }

    @Test
    void shouldReturn_y(){
        assertEquals(Fnrc.firstNonRepeatingLetter("array"), 'y');
    }
}
