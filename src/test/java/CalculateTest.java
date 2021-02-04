import model.MathematicalOperation;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import util.Calculate;

public class CalculateTest {

    Calculate calculate = new Calculate();

    @Test
    public void result() {
        Integer result = 40;
        Assertions.assertEquals(result, calculate.result(new MathematicalOperation(5, "*", 8, false)));
        Assertions.assertEquals("VIII", calculate.result(new MathematicalOperation(3, "+", 5, true)));
    }
}
