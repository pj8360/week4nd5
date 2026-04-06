import java.util.Scanner;

public class TriangularParkRoundsCalculator {

    public static int calculateRoundsToComplete5Km(double side1, double side2, double side3) {
        double targetDistanceInMeters = 5000;
        double perimeterInMeters = side1 + side2 + side3;
        int numberOfRounds = (int) Math.ceil(targetDistanceInMeters / perimeterInMeters);
        return numberOfRounds;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Side 1 of the triangular park (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter Side 2 of the triangular park (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter Side 3 of the triangular park (in meters): ");
        double side3 = scanner.nextDouble();

        int numberOfRounds = calculateRoundsToComplete5Km(side1, side2, side3);

        System.out.println("The athlete must complete " + numberOfRounds
                + " round(s) to finish a 5 km run.");

        scanner.close();
    }
}