package util;

import model.MathematicalOperation;

import java.util.Objects;

public class Calculate {
    public   <T> T result (MathematicalOperation math) {
        Objects.requireNonNull(math);
        int firstNumber = math.getNumberOne();
        String operation = math.getOperation();
        int secondNumber = math.getNumberTwo();

        int result = switch (operation) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> firstNumber / secondNumber;
            default -> throw new IllegalStateException("Unexpected operation: " + operation);
        };
        return (T) (math.isRomeNumber() ? RomanArabicConverter.arabicToRoman(result) : result);
    }
}
