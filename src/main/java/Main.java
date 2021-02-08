import util.Calculate;
import util.Parser;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Parser parser = new Parser();
        Calculate calculate = new Calculate();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Mathematical Operation: ");
        String string = scanner.nextLine();
        System.out.println("Result: " + calculate.result(Objects.requireNonNull(parser.readString(string), "String must not be Null ")));
    }
}
