package model;

import java.util.Objects;

public class MathematicalOperation {
    private final int numberOne;
    private final int numberTwo;
    private final String operation;
    private final boolean romeNumber;

    public MathematicalOperation(int numberOne, String operation, int numberTwo, boolean romeNumber) {
        this.numberOne = numberOne;
        this.operation = operation;
        this.numberTwo = numberTwo;
        this.romeNumber = romeNumber;
    }

    public int getNumberOne() {
        return numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public String getOperation() {
        return operation;
    }

    public boolean isRomeNumber() {
        return romeNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathematicalOperation that = (MathematicalOperation) o;
        return numberOne == that.numberOne &&
                numberTwo == that.numberTwo &&
                romeNumber == that.romeNumber &&
                operation.equals(that.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOne, numberTwo, operation, romeNumber);
    }

    @Override
    public String toString() {
        return "MathematicalOperation{" +
                "numberOne=" + numberOne +
                ", numberTwo=" + numberTwo +
                ", operation='" + operation + '\'' +
                ", romeNumber=" + romeNumber +
                '}';
    }
}
