import org.junit.Assert;
import org.junit.Test;
import util.RomanArabicConverterUtil;

public class RomanArabicConverterTest {
    @Test
    public void convertingToArabic() {
        String number = "VIII";
        int result = RomanArabicConverterUtil.romanToArabic(number);
        Assert.assertEquals(8, result);
    }

    @Test
    public void convertingToRoman() {
        int number = 19;
        String result = RomanArabicConverterUtil.arabicToRoman(number);
        Assert.assertEquals(result, "XIX");
    }
}
