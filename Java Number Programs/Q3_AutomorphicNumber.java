import java.util.Scanner;

public class Q3_AutomorphicNumber {

    static boolean isAutomorphicM1(int n) {
        int digits = 0, temp = n;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        int square = n * n;
        int lastModValue = (int) (Math.pow(10, digits));
        System.out.println("Number = " + n);
        System.out.println("Digits = " + digits);
        System.out.println("Last Mod Value = " + lastModValue);
        System.out.println("Square = " + square);
        System.out.println("Last N Digits : " + square % lastModValue);

        if ((square % lastModValue) == n) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isAutomorphicM2(int n) {
        int square = n * n;
        System.out.println("Number = " + n);
        System.out.println("Square = " + square);
        System.out.println("Last N Digits : " + square % 10);

        while (n > 0) {
            if (n % 10 != square % 10) {
                return false;
            }
            n = n / 10;
            square = square / 10;
        }
        return true;
    }

    static boolean countAutomorphicNumbers(int n) {
        int digits = 0, temp = n;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        int square = n * n;

        if ((square % ((int) (Math.pow(10, digits)))) == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // int n = 6;
        // if (isAutomorphicM1(n)) {
        // System.out.println("AutoMorphic");
        // } else {
        // System.out.println("Not AutoMorphic");
        // }

        System.out.print("Enter a Starting Value: ");
        int m = sc.nextInt();
        System.out.print("Enter a Ending Value: ");
        int n = sc.nextInt();

        System.out.println("No. of Automorphic Numbers are: ");
        for (int i = m; i <= n; i++) {
            if (countAutomorphicNumbers(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
