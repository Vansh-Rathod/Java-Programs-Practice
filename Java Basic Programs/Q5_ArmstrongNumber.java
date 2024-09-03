// import java.util.*;

public class Q5_ArmstrongNumber {

    static void isAmstrong1(String str, int length, double sum, double mainNumber) {
        if (str.length() == 0) {
            System.out.println("Sum = " + sum);
            if (sum == mainNumber) {
                System.out.println("Armstrong Number");
            } else {
                System.out.println("Not a Armstrong Number");
            }
        } else {
            char currentCharacter = str.charAt(0);
            // System.out.println("Current Character: " + currentCharacter);

            // subtracting the ascii value we get the same number
            int currentNumber = currentCharacter - '0';
            // System.out.println("Current Num: " + currentNumber);

            double powerOfNumber = Math.pow(currentNumber, length);
            sum = sum + powerOfNumber;

            String newStr = str.substring(1);

            isAmstrong1(newStr, length, sum, mainNumber);
        }
    }

    public static void main(String[] args) {
        String str = "153";

        // converting string into integer
        int strNum = Integer.parseInt(str);
        System.out.println("STRNUM = " + strNum);

        // converting integer into double
        double mainNumber = strNum;

        System.out.println("Number: " + mainNumber);

        isAmstrong1(str, str.length(), 0, mainNumber);
    }

}