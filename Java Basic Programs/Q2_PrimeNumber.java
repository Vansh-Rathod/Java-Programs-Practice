import java.util.Scanner;

public class Q2_PrimeNumber {

    // print Multiples of the number specified
    static void printMultiples(int n) {
        int multiples = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j * i == n) {
                    System.out.println(i + " * " + j + " = " + n);
                    multiples++;
                }
            }
        }
        if (multiples > 1) {
            System.out.println(n + " has " + multiples + " Multiples.");
        } else {
            System.out.println(n + " has " + multiples + " Multiple.");
        }
    }

    // without using flag variable
    static boolean checkPrime1(int n) {

        // true -> it is a prime number
        // false -> it is not a prime number

        if (n == 0 || n == 1) {
            return false; // it is not a prime number
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false; // it is not a prime number
                }
            }
            return true;
        }
    }

    // with using flag variable
    static void checkPrime2(int n) {
        // flag = 0 -> it is a prime number
        // flag = 1 -> it is not a prime number
        int flag = 0;
        if (n == 0 || n == 1) {
            flag = 1; // not a prime number
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = 1; // not a prime number
                    break;
                }
            }
        }

        if (flag == 0) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is not a Prime Number.");
        }
    }

    static void printPrimeNumbersBetweenTwoNumbers(int x, int y){
        System.out.println("List of Prime Numebrs between " + x + " and " + y + " is : ");
        for (int i = x; i <= y; i++) {
            if (checkPrime1(i)) {
                System.out.println(i + " -> Prime Number");
            }
            else {
            System.out.println(i + " -> Not a Prime Number.");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // ------------------------------------------------------------------

        // print multiples of given number
        // printMultiples(n);

        // ------------------------------------------------------------------

        // check prime number v1
        // if (checkPrime1(n)) {
        // System.out.println(n + " is a Prime Number.");
        // } else {
        // System.out.println(n + " is not a Prime Number.");
        // }

        // ------------------------------------------------------------------

        // check prime v2
        // checkPrime2(n);

        // ------------------------------------------------------------------

        // program to check prime numbers between given numbers
        System.out.print("Enter Starting Point: ");
        int x = sc.nextInt();
        System.out.print("Enter Ending Point: ");
        int y = sc.nextInt();
        printPrimeNumbersBetweenTwoNumbers(x, y);

        // ------------------------------------------------------------------
        

    }
}
