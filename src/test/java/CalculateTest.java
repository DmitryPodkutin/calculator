import model.MathematicalOperation;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import util.Calculate;

public class CalculateTest {
    private final Calculate calculate = new Calculate();

    @Test
    public void result() {
        Integer romeResult = 5;
        Assertions.assertEquals(romeResult, calculate.result(new MathematicalOperation(2, "+", 3, false)));
        Assertions.assertEquals(romeResult, calculate.result(new MathematicalOperation(8, "-", 3, false)));
        Assertions.assertEquals(romeResult, calculate.result(new MathematicalOperation(1, "*", 5, false)));
        Assertions.assertEquals(romeResult, calculate.result(new MathematicalOperation(10, "/", 2, false)));

        String arabicResult = "V";
        Assertions.assertEquals(arabicResult, calculate.result(new MathematicalOperation(2, "+", 3, true)));
        Assertions.assertEquals(arabicResult, calculate.result(new MathematicalOperation(8, "-", 3, true)));
        Assertions.assertEquals(arabicResult, calculate.result(new MathematicalOperation(1, "*", 5, true)));
        Assertions.assertEquals(arabicResult, calculate.result(new MathematicalOperation(10, "/", 2, true)));
    }
}
