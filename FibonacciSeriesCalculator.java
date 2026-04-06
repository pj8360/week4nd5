import java.util.Scanner;

public class FibonacciSeriesCalculator {

    public static int calculateFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many Fibonacci numbers to display: ");
        int count = scanner.nextInt();

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < count; i++) {
            System.out.print(calculateFibonacci(i));
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        scanner.close();
    }
}