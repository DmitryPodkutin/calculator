package util;

import util.exeption.ValidationException;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationUtil {

    public final static String romanNumberRegex = "|I|II|III|IV|V|VI|VII|VIII|IX|X";
    public final static String arabicNumberRegex = "[1-9]|10";
    public final static String operation = "[-+*/]";
    public final static String REGEX = MessageFormat.format("({0}{2}){1}({0}{2})", arabicNumberRegex,operation,romanNumberRegex);

    public static String checkIncomingData(String str) {

        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            return str;
        } else {
            throw new ValidationException("Invalid input data");
        }
    }

    public static boolean thisRomanNumber(String[] numbers) {
        return Arrays.stream(numbers).allMatch(number -> number.matches(romanNumberRegex));

    }

    public static void checkOnlyArabicOrOnlyRoman(String firstNumber, String secondNumber) {
        if (firstNumber.matches(arabicNumberRegex) & secondNumber.matches(romanNumberRegex) ||
                firstNumber.matches(romanNumberRegex) && secondNumber.matches(arabicNumberRegex)) {
            throw new ValidationException("Use only Arabic or only Roman numerals");
        }
    }
}
