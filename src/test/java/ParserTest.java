import model.MathematicalOperation;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import util.Parser;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ParserTest {
    private final Parser parser = new Parser();
    private final int firstArabicNumber = 5;
    private final int secondArabicNumber = 8;
    private final String firstRomanNumber = "V";
    private final String secondRomanNumber = "VIII";
    private final List<String> listOperations = Arrays.asList("+", "-", "*", "/");

    @Test
    public void arabicParse() {
        listOperations.forEach(operation -> Assertions.assertEquals(new MathematicalOperation(firstArabicNumber, operation, secondArabicNumber, false)
                , Objects.requireNonNull(parser.readString(MessageFormat.format("{0}" + operation + "{1}", firstArabicNumber, secondArabicNumber)))));

    }

    @Test
    public void romanParse() {
        listOperations.forEach(operation -> Assertions.assertEquals(new MathematicalOperation(firstArabicNumber, operation, secondArabicNumber, true)
                , Objects.requireNonNull(parser.readString(MessageFormat.format("{0}" + operation + "{1}", firstRomanNumber, secondRomanNumber)))));
    }
}

