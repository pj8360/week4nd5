import java.util.Scanner;

public class TowerOfHanoi {

    public static void solveTowerOfHanoi(int numberOfDisks, char sourcePeg, char destinationPeg, char auxiliaryPeg) {
        if (numberOfDisks == 1) {
            System.out.println("Move disk 1 from peg " + sourcePeg + " to peg " + destinationPeg);
            return;
        }

        solveTowerOfHanoi(numberOfDisks - 1, sourcePeg, auxiliaryPeg, destinationPeg);

        System.out.println("Move disk " + numberOfDisks + " from peg " + sourcePeg + " to peg " + destinationPeg);

        solveTowerOfHanoi(numberOfDisks - 1, auxiliaryPeg, destinationPeg, sourcePeg);
    }

    public static int calculateMinimumMoves(int numberOfDisks) {
        int minimumMoves = (int) Math.pow(2, numberOfDisks) - 1;
        return minimumMoves;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of disks: ");
        int numberOfDisks = scanner.nextInt();

        int minimumMoves = calculateMinimumMoves(numberOfDisks);

        System.out.println("\nSolving Tower of Hanoi for " + numberOfDisks + " disk(s):");
        System.out.println("Minimum moves required: " + minimumMoves);
        System.out.println();

        solveTowerOfHanoi(numberOfDisks, 'A', 'C', 'B');

        scanner.close();
    }
}