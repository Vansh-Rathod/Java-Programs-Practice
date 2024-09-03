import java.util.Arrays;

public class Q5_AnagramStrings {

    static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        } else {
            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();

            Arrays.sort(string1);
            Arrays.sort(string2);

            if (Arrays.equals(string1, string2)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "Brag";
        String str2 = "Grab";

        if (isAnagram(str1, str2)) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are not Anagram");
        }
    }
}
