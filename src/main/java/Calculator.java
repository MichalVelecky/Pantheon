import java.math.BigInteger;
import java.util.Scanner;

public class Calculator {

    public static BigInteger multiplicationByArgumentsInput(BigInteger number1, BigInteger number2) {
        return number1.multiply(number2);
    }

    public static BigInteger multiplicationByScannerInput(BigInteger number3, BigInteger number4) {
        return number3.multiply(number4);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stopwatch stopwatch = new Stopwatch();


        int selection;


            System.out.print("Choose method for multiplication " +
                    "(press 1 for input data as cmd arguments, or press 2 for input data from console: ");
            selection = scanner.nextInt();

            if (selection == 1){
                BigInteger number1 = new BigInteger(args[0]);
                BigInteger number2 = new BigInteger(args[1]);

                stopwatch.start();
                System.out.println("Result of multiplication by arguments input is: " + multiplicationByArgumentsInput(number1,number2));
                stopwatch.stop();
                System.out.println("passed time is: " + stopwatch.passedTime + "ms");

            } else if (selection == 2) {
                System.out.println("Enter first number: ");
                BigInteger number3 = new BigInteger(scanner.next());
                System.out.println("Enter second number: ");
                BigInteger number4 = new BigInteger(scanner.next());

                stopwatch.start();
                System.out.println("Result of multiplication by scanner input is: " + multiplicationByScannerInput(number3,number4));
                stopwatch.stop();
                System.out.println("passed time is: " + stopwatch.passedTime + "ms");
            }
            else {
                System.out.println("incorrect choice!");
            }
        }
}
