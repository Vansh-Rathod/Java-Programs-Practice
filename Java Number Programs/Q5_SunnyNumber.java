import java.util.*;

public class Q5_SunnyNumber {

    static boolean isPerfectSquare(int n) {
        int intSquareRoot = (int) Math.sqrt(n);
        double doubleSquareRoot = Math.sqrt(n);
        double remain = (double) doubleSquareRoot - intSquareRoot;

        if (remain == 0) {

            return true;
        } else {

            return false;
        }
    }

    static boolean isSunnyNumber(int n) {
        boolean bool = isPerfectSquare(n + 1);
        if (bool) {

            return true;
        } else {

            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = 16;
        // if (isSunnyNumber(n)) {
        // System.out.println(n + " is a Sunny Number");
        // } else {
        // System.out.println(n + " is not a Sunny Number");
        // }

        System.out.print("Enter Starting Point : ");
        int start = sc.nextInt();
        System.out.print("Enter Ending Point : ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (isSunnyNumber(i)) {
                System.out.println(i + " is a Sunny Number");
            }
        }
    }
}
