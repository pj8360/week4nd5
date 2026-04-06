import java.util.Scanner;

public class PrimeNumberAnalyzer {

    public static boolean checkIfPrime(int number) {
        if (number <= 1) {
            return false;
        }
        int sqrtOfNumber = (int) Math.sqrt(number);
        for (int divisor = 2; divisor <= sqrtOfNumber; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static long calculateSumOfPrimesUpToN(int n) {
        long sumOfPrimes = 0;
        for (int current = 2; current <= n; current++) {
            if (checkIfPrime(current)) {
                sumOfPrimes = sumOfPrimes + current;
            }
        }
        return sumOfPrimes;
    }

    public static void printAllPrimesUpToN(int n) {
        System.out.print("Prime numbers up to " + n + ": ");
        for (int current = 2; current <= n; current++) {
            if (checkIfPrime(current)) {
                System.out.print(current + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer N: ");
        int n = scanner.nextInt();

        System.out.print("Enter a number to check if it is prime: ");
        int numberToCheck = scanner.nextInt();

        boolean isPrime = checkIfPrime(numberToCheck);

        if (isPrime) {
            System.out.println(numberToCheck + " is a Prime number.");
        } else {
            System.out.println(numberToCheck + " is NOT a Prime number.");
        }

        printAllPrimesUpToN(n);

        long sumOfPrimes = calculateSumOfPrimesUpToN(n);
        System.out.println("Sum of all prime numbers up to " + n + ": " + sumOfPrimes);

        scanner.close();
    }
}