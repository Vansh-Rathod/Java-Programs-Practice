public class Q7_Patterns {

    // STAR PATTERNS

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) { // spaces
                System.out.print("  ");
            }
            for (int k = n - i; k <= n; k++) { // stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) { // spaces
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) { // stars
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern4(int n) {
        for (int i = 0; i < n; i++) {

            // upper triangle
            for (int j = i; j < n - 1; j++) { // upper triangle spaces
                System.out.print("  ");
            }
            for (int k = 0; k < (2 * i) + 1; k++) { // upper triangle stars
                System.out.print("* ");
            }

            System.out.println();

        }
        for (int i = 0; i < n - 1; i++) {

            // // lower triangle
            for (int j = n - i; j <= n; j++) { // lower triangle spaces
                System.out.print("  ");
            }
            for (int k = 0; k < (2 * (n - i - 2)) + 1; k++) { // lower triangle stars
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) { // spaces
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) { // stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) { // spaces
                System.out.print(" ");
            }
            for (int k = i; k < n; k++) { // stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k < n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int i = 0; i < n; i++) {// upper triangle
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) { // lower triangle
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) { // spaces
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) { // stars
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - i - 1; j < n; j++) { // spaces
                System.out.print("  ");
            }
            for (int j = i; j < n - 1; j++) { // stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        for (int i = 0; i < n; i++) { // upper
            for (int j = 0; j < i; j++) { // spaces
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) { // stars
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) { // lower
            for (int j = i; j < n; j++) { // spaces
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) { // stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n) { // remaining

    }

    static void pattern13(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) { // spaces
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i) + 1; j++) { // stars
                if (j == 0 || j == (2 * i) || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) { // spaces
                System.out.print(" ");
            }
            for (int j = i; j < (2 * (n - 1)) - i + 1; j++) { // stars
                if (j == i || j == (2 * (n - 1) - i) || i == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern15(int n) {
        for (int i = 0; i < n; i++) { // upper
            for (int j = i; j < n - 1; j++) { // spaces
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i) + 1; j++) { // stars
                if (j == 0 || j == (2 * i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) { // lower
            for (int j = 0; j <= i; j++) { // spaces
                System.out.print(" ");
            }
            for (int j = i; j < (2 * (n - 2)) - i + 1; j++) { // stars
                if (j == i || j == (2 * (n - 2) - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // NUMBER PATTERNS

    static void pattern16(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    static void pattern17(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    static void pattern18(int n) { // remaining

    }

    static void pattern19(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) { // spaces
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) { // numbers
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) { // reverse numbers
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++) { // spaces
                System.out.print("  ");
            }
            for (int j = n - i; j >= 1; j--) { // numbers
                System.out.print(j + " ");
            }
            for (int j = 2; j <= n - i; j++) { // reverse numbers
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern20(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void pattern21(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern22(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern23(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    static void pattern24(int n) {
        for (int i = 1; i <= n; i++) {
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                if (num == 0) {
                    num = 1;
                } else {
                    num = 0;
                }
            }
            System.out.println();
        }
    }

    static void pattern25(int n) {
        for (int i = 1; i <= n; i++) { // upper
            for (int j = 1; j < i; j++) { // spaces
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) { // numbers
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) { // lower
            for (int j = 1; j <= n - i - 1; j++) { // spaces
                System.out.print(" ");
            }
            for (int j = n - i; j <= n; j++) { // numbers
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern26(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern27(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern29(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i + 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern31(int n) {
        for (int i = 1; i <= n; i++) { // upper
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) { // lower
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern32(int n) {
        for (int i = 1; i <= n; i++) { // upper
            for (int j = 1; j < i; j++) { // spaces
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) { // numbers
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) { // lower
            for (int j = 1; j <= n - i - 1; j++) { // spaces
                System.out.print("  ");
            }
            for (int j = n - i; j <= n; j++) { // numbers
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern33(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("1 ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void pattern34(int n) {
        for (int i = 1; i <= n; i++) {
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num + n - j;
            }
            System.out.println();
        }
    }

    static void pattern35(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern36(int n) {

        // 7 7 7 7 7 7 7 7 7 7 7 7 7
        // 7 6 6 6 6 6 6 6 6 6 6 6 7
        // 7 6 5 5 5 5 5 5 5 5 5 6 7
        // 7 6 5 4 4 4 4 4 4 4 5 6 7
        // 7 6 5 4 3 3 3 3 3 4 5 6 7
        // 7 6 5 4 3 2 2 2 3 4 5 6 7
        // 7 6 5 4 3 2 1 2 3 4 5 6 7
        // 7 6 5 4 3 2 2 2 3 4 5 6 7
        // 7 6 5 4 3 3 3 3 3 4 5 6 7
        // 7 6 5 4 4 4 4 4 4 4 5 6 7
        // 7 6 5 5 5 5 5 5 5 5 5 6 7
        // 7 6 6 6 6 6 6 6 6 6 6 6 7
        // 7 7 7 7 7 7 7 7 7 7 7 7 7

    }

    // CHARACTER PATTERNS

    static void pattern37(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println();
        }
    }

    static void pattern38(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + i) + " ");
            }
            System.out.println();
        }
    }

    static void pattern39(int n) {
        for (int i = 0; i < n; i++) { // upper
            for (int j = 0; j < n - i; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) { // lower
            for (int j = 0; j <= i + 1; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println();
        }
    }

    static void pattern40(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i + 1; j++) { // spaces
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) { // characters
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println();
        }
    }

    static void pattern41(char ch) {
        int n = ch - 'A' + 1; // 15+1=16
        System.out.println(n);

        for (int i = 0; i < n; i++) { // upper
            for (int j = 0; j < n - i - 1; j++) { // spaces
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) { // characters
                if (j == 0 || j == i) {
                    System.out.print((char) ('A' + i) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) { // lower
            for (int j = 0; j <= i; j++) { // spaces
                System.out.print(" ");
            }
            for (int j = 0; j < n - i - 1; j++) { // characters
                if (j == 0 || j == n - i - 2) {
                    System.out.print((char) ('A' + n - i - 2) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        
        int n = 9;
        char ch = 'Z';

        // star patterns

        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        // pattern4(n);
        // pattern5(n);
        // pattern6(n);
        // pattern7(n);
        // pattern8(n);
        // pattern9(n);
        // pattern10(n);
        // pattern11(n);
        // pattern12(n); // remaining
        // pattern13(n);
        // pattern14(n);
        // pattern15(n);

        // number patterns

        // pattern16(n);
        // pattern17(n);
        // pattern18(n); // remaining
        // pattern19(n);
        // pattern20(n);
        // pattern21(n);
        // pattern22(n);
        // pattern23(n);
        // pattern24(n);
        // pattern25(n);
        // pattern26(n);
        // pattern27(n);
        // pattern28(n);
        // pattern29(n);
        // pattern30(n);
        // pattern31(n);
        // pattern32(n);
        // pattern33(n);
        // pattern34(n);
        // pattern35(n);
        // pattern36(n);

        // character patterns
        // pattern37(n);
        // pattern38(n);
        // pattern39(n);
        // pattern40(n);
        pattern41(ch);

        
    }
}
