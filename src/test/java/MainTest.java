import lab.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void shouldAddTwoNumbers() {
        Main main = new Main();
        assertEquals(10, main.add(5, 5));
    }
}