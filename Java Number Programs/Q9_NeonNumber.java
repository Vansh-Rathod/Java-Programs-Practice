import java.util.Scanner;

public class Q9_NeonNumber {
    static boolean isNeon(int n) {
        int numSquare = n * n;
        System.out.println("Number = " + n);
        System.out.println("Square = " + numSquare);

        int temp = numSquare;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum += rem;
            temp /= 10;
        }

        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }

    static boolean noOfNeons(int n) {
        int numSquare = n * n;

        int temp = numSquare;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum += rem;
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

        // int n = 9;
        // if (isNeon(n)) {
        //     System.out.println(n + " is Neon");
        // } else {
        //     System.out.println(n + " is not Neon");
        // }

        System.out.print("Enter Starting Point: ");
        int n = sc.nextInt();
        System.out.print("Enter Ending Point: ");
        int m = sc.nextInt();
        for (int i = n; i <= m; i++) {
            if (noOfNeons(i)) {
                System.out.println(i + " ");
            }
        }
    }
}