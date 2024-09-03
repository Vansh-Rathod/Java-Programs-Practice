public class Q13_CheckPalindrome {

    // Time Complexity -> O(n), where n is length of string
    static boolean isPalindrome(String str) {
        String tempStr = "";
        for (int i = 0; i < str.length(); i++) {
            tempStr = tempStr + str.charAt(i);
            // System.out.println("At i = " + i + " -> " + tempStr);
        }
        if (str.equals(tempStr)) {
            return true;
        } else {
            return false;
        }
    }

    // Time Complexity -> O(n/2), where n is length of string
    static boolean isPalindrome2(String str) {
        int mid = str.length() / 2;
        System.out.println("mid = " + mid);
        char startChar, endChar;
        for (int i = 0, j = str.length() - 1; i < mid && j >= mid; i++, j--) {
            startChar = str.charAt(i);
            endChar = str.charAt(j);
            System.out.println("startChar = " + startChar + ", endChar = " + endChar);
            if (startChar == endChar) {
                System.out.println("Eat 5 Star, Do Nothing..");
            } else {
                System.out.println("i have to do something!");
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // String str = "abcba";
        // String str = "aba";
        String str = "abba";
        if (isPalindrome2(str)) {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is not Palindrome");
        }
    }
}