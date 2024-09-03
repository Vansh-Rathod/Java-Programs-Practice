import java.util.Scanner;

public class Q1_FibonacciSeries {

    // using for loop
    static void printFibonacciSeries1(int n) {
        int x = 0, y = 1, temp;
        System.out.print(x + " ");
        System.out.print(y + " ");
        for (int i = 1; i <= n - 2; i++) {
            temp = x + y;
            System.out.print(temp + " ");
            x = y;
            y = temp;
        }
    }

    // using recursion v1
    static void printFibonacciSeries2(int x, int y, int n) {
        if (n == 0) {
            return;
        }
        int temp = x + y;
        System.out.print(temp + " ");
        x = y;
        y = temp;
        printFibonacciSeries2(x, y, n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // printFibonacciSeries1(n);

        int x = 0, y = 1;
        System.out.print(x + " ");
        System.out.print(y + " ");
        printFibonacciSeries2(x, y, n - 2);
    }
}