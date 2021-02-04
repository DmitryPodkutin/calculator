package model;

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
}
