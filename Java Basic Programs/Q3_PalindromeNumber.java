import java.util.Scanner;

public class Q3_PalindromeNumber {

    static boolean checkPalindromeM1(String original) {
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        if (original.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }

    static boolean checkPalindromeM2(int n) {
        int temp, sum = 0, remainder;
        temp = n;

        while (temp > 0) {
            System.out.println("ROund");
            remainder = temp % 10;
            System.out.println("Remainder: " + remainder);
            sum = (sum * 10) + remainder;
            System.out.println("Sum = " + sum);
            temp = temp / 10;
            System.out.println("Temp = " + temp);
        }

        if (n == sum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // METHOD-1
        // System.out.print("Enter a String(in Number): ");
        // String original = sc.next();

        // if (checkPalindromeM1(original)) {
        // System.out.println(original + " is Palindrome");
        // } else {
        // System.out.println(original + " is Not Palindrome");
        // }

        // METHOD-2
        // System.out.println("Enter a number: ");
        // int n = sc.nextInt();
        int n = 454;

        if (checkPalindromeM2(n)) {
            System.out.println(n + " is Palindrome");
        } else {
            System.out.println(n + " is Not Palindrome");
        }
    }
}
