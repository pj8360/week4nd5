public class SpringSeason {

    public static boolean checkIfSpring(int month, int day) {
        boolean isAfterSpringStart = (month > 3) || (month == 3 && day >= 20);
        boolean isBeforeSpringEnd  = (month < 6) || (month == 6 && day <= 20);
        return isAfterSpringStart && isBeforeSpringEnd;
    }

    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day   = Integer.parseInt(args[1]);

        boolean springResult = checkIfSpring(month, day);

        if (springResult) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}