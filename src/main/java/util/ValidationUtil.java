package util;

import util.exeption.ValidationException;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationUtil {

    public static final String arabicAndRomanNumbersPattern = "([1-9]|10|I|II|III|IV|V|VI|VII|VIII|IX|X)";
    public static final String REGEX = arabicAndRomanNumbersPattern + "([\\+|\\-|\\*|\\/])" + arabicAndRomanNumbersPattern;
    public final static String romanNumberRegex = "I|II|III|IV|V|VI||VII|VIII|IX|X|";
    public final static String arabicNumberRegex = "[1-9]|10";

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
        return "true".equals(Arrays.stream(numbers).reduce((firstNumber, secondNumber) -> {
            checkOnlyArabicOrOnlyRoman(firstNumber, secondNumber);
            return String.valueOf(firstNumber.matches(romanNumberRegex) || secondNumber.matches(romanNumberRegex));
        }).orElse("false"));
    }

    public static void checkOnlyArabicOrOnlyRoman(String firstNumber, String secondNumber) {
        if (firstNumber.matches(arabicNumberRegex) & secondNumber.matches(romanNumberRegex) ||
                firstNumber.matches(romanNumberRegex) && secondNumber.matches(arabicNumberRegex)) {
            throw new ValidationException("Use only Arabic or only Roman numerals");
        }
    }
}
