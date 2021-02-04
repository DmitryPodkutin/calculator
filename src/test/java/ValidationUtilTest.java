import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import util.ValidationUtil;
import util.exeption.ValidationException;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import static org.junit.Assert.assertThrows;
import static util.ValidationUtil.*;


public class ValidationUtilTest {
    Pattern pattern = Pattern.compile(ValidationUtil.REGEX);
    List<String> falseStrings = Arrays.asList("10+31", "12+1", "1+0", "01+1", "1+31", "10+g", "A+22");
    List<String> trueStrings = Arrays.asList("1+10", "1+9");
    String[] romanNumbers = new String[]{"II", "V"};

    @Test
    public void unCorrectIncomingData() {
        falseStrings.forEach(string -> Assertions.assertFalse(pattern.matcher(string).matches()));
    }

    @Test
    public void nCorrectIncomingData() {
        trueStrings.forEach(string -> Assertions.assertTrue(pattern.matcher(string).matches()));

    }

    @Test
    public void checkUnCorrectIncomingData() {
        falseStrings.forEach(string -> assertThrows(ValidationException.class, () -> checkIncomingData(string)));
    }

    @Test
    public void checkCorrectIncomingData() {
        trueStrings.forEach(string -> Assertions.assertEquals(string, checkIncomingData(string)));
    }

    @Test
    public void checkOnlyArabicOrOnlyRomanTest() {
        assertThrows(ValidationException.class, () -> checkOnlyArabicOrOnlyRoman("II", "5"));
    }

    @Test
    public void thisRomanNumberTest() {
        Assertions.assertTrue(thisRomanNumber(romanNumbers));
    }
}
