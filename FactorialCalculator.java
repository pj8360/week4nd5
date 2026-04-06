import java.util.Scanner;

public class FactorialCalculator {

    public static long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        long factorialResult = calculateFactorial(number);

        System.out.println("The factorial of " + number + " is: " + factorialResult);

        scanner.close();
    }
}