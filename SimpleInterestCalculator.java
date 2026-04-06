import java.util.Scanner;

public class SimpleInterestCalculator {

    public static double calculateSimpleInterest(double principal, double rateOfInterest, double time) {
        double simpleInterest = (principal * rateOfInterest * time) / 100;
        return simpleInterest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest (%): ");
        double rateOfInterest = scanner.nextDouble();

        System.out.print("Enter Time (years): ");
        double time = scanner.nextDouble();

        double simpleInterest = calculateSimpleInterest(principal, rateOfInterest, time);

        System.out.println("The Simple Interest is " + simpleInterest
                + " for Principal " + principal
                + ", Rate of Interest " + rateOfInterest
                + " and Time " + time);

        scanner.cl