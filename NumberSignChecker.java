import java.util.Scanner;

public class NumberSignChecker {

    public static int checkNumberSign(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int signResult = checkNumberSign(number);

        if (signResult == 1) {
            System.out.println(number + " is a Positive number.");
        } else if (signResult == -1) {
            System.out.println(number + " is a Negative number.");
        } else {
            System.out.println("The number is Zero.");
        }

        scanner.close();
    }
}