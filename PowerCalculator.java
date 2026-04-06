import java.util.Scanner;

public class PowerCalculator {

    // Recursive method
    public static double calculatePowerRecursive(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent < 0) {
            return 1.0 / calculatePowerRecursive(base, -exponent);
        } else {
            return base * calculatePowerRecursive(base, exponent - 1);
        }
    }

    // Using java.lang.Math standard library
    public static double calculatePowerUsingMath(double base, int exponent) {
        double result = Math.pow(base, exponent);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        double recursiveResult = calculatePowerRecursive(base, exponent);
        double mathResult      = calculatePowerUsingMath(base, exponent);

        System.out.println("Result using Recursive Method : " + recursiveResult);
        System.out.println("Result using Math.pow()       : " + mathResult);

        scanner.close();
    }
}