import java.util.Scanner;

public class Q4_Factorial {

    // using for loop
    static int calculateFactorial1(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }

    // using while loop
    static int calculateFactorial2(int n) {
        int fact = 1;
        while (n > 0) {
            fact = fact * n;
            n--;
        }
        return fact;
    }

    // using recursion
    static int calculateFactorial3(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial3(n - 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        // int ans1 = calculateFactorial1(n);
        // System.out.println("Factorial of " + n + " = " + ans1);

        // int ans2 = calculateFactorial2(n);
        // System.out.println("Factorial of " + n + " = " + ans2);

        int ans3 = calculateFactorial3(n);
        System.out.println("Factorial of " + n + " = " + ans3);

    }
}
