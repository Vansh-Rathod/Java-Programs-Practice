import java.util.*;

public class Q4_PetersonNumber {

    static int calculateFactorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    static boolean isPetersonNumber(int n) {
        int temp = n, rem;
        int sum = 0;
        while (temp > 0) {
            rem = temp % 10;
            int factorial = calculateFactorial(rem);
            sum = sum + factorial;
            temp /= 10;
        }

        if (sum == n) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = 145;
        // if (isPetersonNumber(n)) {
        // System.out.println(n + " is Peterson Number");
        // } else {
        // System.out.println(n + " is not a Peterson Number");
        // }

        System.out.print("Enter Starting Point : ");
        int start = sc.nextInt();
        System.out.print("Enter Ending Point : ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (isPetersonNumber(i)) {
                System.out.println(i + " is Peterson Number");
            }
        }
    }
}
