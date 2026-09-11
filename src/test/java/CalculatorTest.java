import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator obj = new Calculator();
        assertEquals(8, obj.add(5, 3));
    }
}
