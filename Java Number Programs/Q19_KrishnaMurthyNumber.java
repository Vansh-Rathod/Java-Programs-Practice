import java.util.Scanner;

public class Q19_KrishnaMurthyNumber {

    static int calculateFactorial(int n) {
        int fact = 1;
        for (int i = n; i >= 2; i--) {
            fact *= i;
        }
        return fact;
    }

    static boolean isKrishnaMurthy(int n) {
        int temp = n, sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum = sum + calculateFactorial(rem);
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

        int n = 145;
        if (isKrishnaMurthy(n)) {
        System.out.println(n + " is KrishnaMurthy Number");
        } else {
        System.out.println(n + " is not KrishnaMurthy Number");
        }

        // System.out.print("Enter Starting Point: ");
        // int n = sc.nextInt();
        // System.out.print("Enter Ending Point: ");
        // int m = sc.nextInt();

        // for (int i = n; i <= m; i++) {
        //     if (isKrishnaMurthy(i)) {
        //         System.out.println(i + " is KrishnaMurthy Number");
        //     }
        // }

    }
}
