import java.util.Scanner;

public class HandshakeCalculator {

    public static int calculateMaxHandshakes(int numberOfStudents) {
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        return maxHandshakes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int maxHandshakes = calculateMaxHandshakes(numberOfStudents);

        System.out.println("The maximum number of possible handshakes among "
                + numberOfStudents + " students is: " + maxHandshakes);

        scanner.close();
    }
}