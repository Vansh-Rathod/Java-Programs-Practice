import java.util.Scanner;

public class Q6_TechNumber {

    static boolean isTechNumber(int n) {
        int temp = n, digits = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        if (digits % 2 == 0) {
            temp = n;

            int firstHalf = temp % (int) Math.pow(10, digits / 2);
            int secondHalf = temp / (int) Math.pow(10, digits / 2);
            // System.out.println("First = " + firstHalf);
            // System.out.println("Second = " + secondHalf);

            int squareOfSum = (firstHalf + secondHalf) * (firstHalf + secondHalf);
            // System.out.println("Square of Sum = " + squareOfSum);

            if (squareOfSum == n) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = 2025;
        // if (isTechNumber(n)) {
        // System.out.println(n + " is Tech Number");
        // } else {
        // System.out.println(n + " is not a Tech Number");
        // }

        System.out.print("Enter Starting Point: ");
        int n = sc.nextInt();
        System.out.print("Enter Ending Point: ");
        int m = sc.nextInt();
        for (int i = n; i <= m; i++) {
            if (isTechNumber(i)) {
                System.out.println(i);
            }
        }
    }
}
