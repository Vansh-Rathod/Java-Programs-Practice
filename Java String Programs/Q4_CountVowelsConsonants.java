import java.util.HashMap;

public class Q4_CountVowelsConsonants {

    static HashMap<String, Integer> countTypeOfCharacters(String str) {
        str = str.toLowerCase();
        int vowels = 0, consonants = 0, digits = 0, spaces = 0, punctuations = 0;
        for (int i = 0; i < str.length(); i++) {
            // counting spaces
            if (str.charAt(i) == ' ') {
                spaces++;
            }
            // counting vowels
            else if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                vowels++;
            }
            // counting consonants
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                consonants++;
            }
            // counting digits
            else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                digits++;
            }
            // counting punctuations
            else if (str.charAt(i) == '.' || str.charAt(i) == '?' || str.charAt(i) == '\'' || str.charAt(i) == '\"'
                    || str.charAt(i) == '!' || str.charAt(i) == '-' || str.charAt(i) == ',' || str.charAt(i) == ':'
                    || str.charAt(i) == ';') {
                punctuations++;
            }
        }
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Vowels", vowels);
        map.put("Consonants", consonants);
        map.put("Digits", digits);
        map.put("Spaces", spaces);
        map.put("Punctuations", punctuations);

        return map;
    }

    public static void main(String[] args) {
        String str = "This is a really simple sentence";
        System.out.println("Length = " + str.length());

        HashMap<String, Integer> map = countTypeOfCharacters(str);
        System.out.println(map);

    }
}
