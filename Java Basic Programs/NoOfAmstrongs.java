public class NoOfAmstrongs {

    static void isAmstrong(String str, int length, double sum, double mainNum) {
        if (str.length() == 0) {
            // System.out.println("Sum = " + sum);
            if (sum == mainNum) { // amstrong number
                System.out.println(mainNum);
            }
        } else {
            char currentCharacter = str.charAt(0);
            // System.out.println("Current Character: " + currentCharacter);

            int currentNumber = currentCharacter - '0';
            // System.out.println("Current Num: " + currentNumber);

            double powerOfNumber = Math.pow(currentNumber, length);
            sum = sum + powerOfNumber;

            String newStr = str.substring(1);

            isAmstrong(newStr, length, sum, mainNum);
        }
    }

    public static void main(String[] args) {
        int limit = 999;
        for (int i = 0; i < limit; i++) {
            String str = i + "";
            // System.out.println(str);

            // converting string into integer
            int strNum = Integer.parseInt(str);

            // converting integer into double
            double mainNumber = strNum;

            // System.out.println(mainNumber);

            isAmstrong(str, str.length(), 0, mainNumber);
        }
    }
}
