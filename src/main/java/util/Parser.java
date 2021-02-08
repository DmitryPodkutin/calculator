package util;

import model.MathematicalOperation;

import java.text.MessageFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static util.RomanArabicConverterUtil.romanToArabic;
import static util.ValidationUtil.checkIncomingData;
import static util.ValidationUtil.operation;
import static util.ValidationUtil.checkOnlyArabicOrOnlyRoman;
import static util.ValidationUtil.romanNumberRegex;
import static util.ValidationUtil.thisRomanNumber;

public class Parser {
    public MathematicalOperation parse(String string) {
        String validString = checkIncomingData(string);
        Matcher matcher = Pattern.compile(operation).matcher(validString.trim());
        String operation = null;
        if (matcher.find()) {
            operation = matcher.group();
        }
        String[] numbers = validString.split(MessageFormat.format("\\{0}", operation));
        checkOnlyArabicOrOnlyRoman(numbers[0], numbers[1]);
        return createMathematicalOperation(operation, numbers);
    }

    private static MathematicalOperation createMathematicalOperation(String operation, String[] numbers) {
        int[] intNumbers = new int[2];
        for (int i = 0; i < 2; i++) {
            if (Pattern.compile(romanNumberRegex).matcher(numbers[i]).matches()) {
                intNumbers[i] = romanToArabic(numbers[i]);
            } else {
                intNumbers[i] = Integer.parseInt(numbers[i]);
            }
        }
        return new MathematicalOperation(intNumbers[0], operation, intNumbers[1],
                thisRomanNumber(numbers));
    }
}
