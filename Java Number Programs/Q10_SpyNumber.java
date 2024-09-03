import java.util.Scanner;

public class Q10_SpyNumber {

    static boolean isSpy(int n) {
        int temp = n, sum = 0, mul = 1;
        while (temp > 0) {
            int rem = temp % 10;
            sum += rem;
            mul *= rem;
            temp /= 10;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Mul = " + mul);
        if (sum == mul) {
            return true;
        } else {
            return false;
        }
    }

    static boolean countSpies(int n) {
        int temp = n, sum = 0, mul = 1;
        while (temp > 0) {
            int rem = temp % 10;
            sum += rem;
            mul *= rem;
            temp /= 10;
        }

        if (sum == mul) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = 1142;
        // if (isSpy(n)) {
        //     System.out.println(n + " is a Spy Number");
        // } else {
        //     System.out.println(n + " is not a Spy Number");
        // }

        System.out.print("Enter Starting Point: ");
        int n = sc.nextInt();
        System.out.print("Enter Ending Point: ");
        int m = sc.nextInt();

        for (int i = n; i <= m; i++) {
            if (countSpies(i)) {
                System.out.println(i);
            }
        }

    }
}
