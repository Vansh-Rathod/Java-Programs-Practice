import java.util.Scanner;

public class Q7_FascinatingNumber {

    static boolean isFascinating(int n) {
        int[] arr = new int[9];
        int n1 = n * 2;
        int n2 = n * 3;
        String fullNumber = String.valueOf(n) + String.valueOf(n1) + String.valueOf(n2);

        for (int i = 0; i < arr.length; i++) {
            arr[fullNumber.charAt(i) - '1']++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 1902;
        if (isFascinating(n)) {
        System.out.println(n + " is a Fascinating Number");
        } else {
        System.out.println(n + " is not a Fascinating Number");
        }

        // System.out.print("Enter Starting Three Digit Number : ");
        // int start = sc.nextInt();
        // System.out.print("Enter Ending Number : ");
        // int end = sc.nextInt();

        // for (int i = start; i <= end; i++) {
        //     if (isFascinating(start)) {
        //         System.out.println(start + " is a Fascinating Number");
        //     }
        // }
    }
}
