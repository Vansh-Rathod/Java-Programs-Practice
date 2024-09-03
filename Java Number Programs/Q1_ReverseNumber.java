public class Q1_ReverseNumber {

    static int reverseNumber(int n) {
        int revNum = 0, rem;
        int temp = n;
        while (temp > 0) {
            rem = temp % 10;
            revNum = (revNum * 10) + rem;
            temp = temp / 10;
        }
        return revNum;

    }

    public static void main(String[] args) {
        int n = 98765;
        int reversedNumber = reverseNumber(n);
        System.out.println("Reversed Number = " + reversedNumber);
    }
}