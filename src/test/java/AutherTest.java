import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutherTest {

    private Auther testAuther;

    @BeforeEach
    void setUp() {
        testAuther = new Auther( "Jane", "jane@northeastern.edu", "225 Terry Ave");
    }

    @Test
    void getName() {
        assertEquals("Jane", testAuther.getName());
    }

    @Test
    void getEmail() {
        assertEquals("jane@northeastern.edu", testAuther.getEmail());
    }

    @Test
    void getAddress() {
        assertEquals("225 Terry Ave", testAuther.getAddress());
    }
}